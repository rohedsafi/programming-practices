package MyProject;

import javax.swing.*;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class PaletteView extends JFrame {
    private final PaletteController controller;
    private final JPanel previewPanel = new JPanel() {
        @Override protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.setColor(controller.getModel().getCurrentColor());
            g.fillRect(0, 0, getWidth(), getHeight());
        }
    };
    private final JPanel palettePanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 5));
    private final JSlider hue = new JSlider(0, 360, 0);
    private final JSlider sat = new JSlider(0, 100, 100);
    private final JSlider bri = new JSlider(0, 100, 100);

    public PaletteView(PaletteController controller) {
        this.controller = controller;
        setTitle("Color Picker & Palette Manager");
        setSize(900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        add(createPickerPanel(), BorderLayout.WEST);
        previewPanel.setPreferredSize(new Dimension(300, 300));
        previewPanel.setBorder(BorderFactory.createTitledBorder("Current Color"));
        add(previewPanel, BorderLayout.CENTER);

        JScrollPane scroll = new JScrollPane(palettePanel);
        scroll.setPreferredSize(new Dimension(0, 120));
        add(scroll, BorderLayout.SOUTH);

        refreshPalette();
        setVisible(true);
    }

    private JPanel createPickerPanel() {
        JPanel p = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(10, 10, 10, 10);

        hue.setMajorTickSpacing(60); hue.setPaintLabels(true);
        sat.setMajorTickSpacing(20); sat.setPaintLabels(true);
        bri.setMajorTickSpacing(20); bri.setPaintLabels(true);

        ChangeListener listener = e -> controller.updateFromHSV(
            hue.getValue() / 360f, sat.getValue() / 100f, bri.getValue() / 100f);

        hue.addChangeListener(listener);
        sat.addChangeListener(listener);
        bri.addChangeListener(listener);

        JButton add = new JButton("Add to Palette");
        add.addActionListener(e -> controller.addCurrentColor());

        JButton save = new JButton("Save Palette");
        save.addActionListener(e -> controller.savePalette());

        JButton load = new JButton("Load Palette");
        load.addActionListener(e -> controller.loadPalette());

        int y = 0;
        gbc.gridx = 0;
        gbc.gridy = y++; p.add(new JLabel("Hue (0-360)"), gbc);
        gbc.gridy = y++; p.add(hue, gbc);
        gbc.gridy = y++; p.add(new JLabel("Saturation (%)"), gbc);
        gbc.gridy = y++; p.add(sat, gbc);
        gbc.gridy = y++; p.add(new JLabel("Brightness (%)"), gbc);
        gbc.gridy = y++; p.add(bri, gbc);
        gbc.gridy = y++; p.add(add, gbc);
        gbc.gridy = y++; p.add(save, gbc);
        gbc.gridy = y++; p.add(load, gbc);

        p.setBorder(BorderFactory.createTitledBorder("HSV Color Picker"));
        return p;
    }

    public void refreshPalette() {
        palettePanel.removeAll();
        for (Color c : controller.getModel().getPalette()) {
            JPanel swatch = new JPanel() {
                @Override protected void paintComponent(Graphics g) {
                    g.setColor(c);
                    g.fillRect(0, 0, getWidth(), getHeight());
                    g.setColor(Color.BLACK);
                    g.drawRect(0, 0, getWidth()-1, getHeight()-1);
                }
            };
            swatch.setPreferredSize(new Dimension(60, 60));
            swatch.setToolTipText(String.format("#%06X", c.getRGB() & 0xFFFFFF));
            swatch.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent e) {
                    controller.setCurrentColor(c);
                }
            });
            palettePanel.add(swatch);
        }
        palettePanel.revalidate();
        palettePanel.repaint();
    }

    public void updateSliders(Color c) {
        float[] hsb = Color.RGBtoHSB(c.getRed(), c.getGreen(), c.getBlue(), null);
        hue.setValue((int)(hsb[0] * 360));
        sat.setValue((int)(hsb[1] * 100));
        bri.setValue((int)(hsb[2] * 100));
    }

    public void repaintPreview() { previewPanel.repaint(); }
}
