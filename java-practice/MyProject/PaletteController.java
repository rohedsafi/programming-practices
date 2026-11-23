package MyProject;

import java.awt.Color;
import java.io.File;
import javax.swing.*;

public class PaletteController {
    private final PaletteModel model = new PaletteModel();
    private final PaletteView view = new PaletteView(this);

    public PaletteController() {
        view.updateSliders(model.getCurrentColor());
        view.repaintPreview();
    }

    public PaletteModel getModel() { return model; }

    public void updateFromHSV(float h, float s, float b) {
        Color c = new Color(Color.HSBtoRGB(h, s, b));
        model.setCurrentColor(c);
        view.repaintPreview();
    }

    public void setCurrentColor(Color c) {
        model.setCurrentColor(c);
        view.updateSliders(c);
        view.repaintPreview();
    }

    public void addCurrentColor() {
        model.addColor(model.getCurrentColor());
        view.refreshPalette();
    }

    public void savePalette() {
        JFileChooser fc = new JFileChooser();
        if (fc.showSaveDialog(view) == JFileChooser.APPROVE_OPTION) {
            File f = fc.getSelectedFile();
            if (!f.getName().endsWith(".palette")) f = new File(f.getPath() + ".palette");
            try {
                model.saveToFile(f);
                JOptionPane.showMessageDialog(view, "Saved successfully!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(view, "Error: " + ex.getMessage());
            }
        }
    }

    public void loadPalette() {
        JFileChooser fc = new JFileChooser();
        if (fc.showOpenDialog(view) == JFileChooser.APPROVE_OPTION) {
            try {
                PaletteModel loaded = PaletteModel.loadFromFile(fc.getSelectedFile());
                model.getPalette().clear();
                model.getPalette().addAll(loaded.getPalette());
                if (!loaded.getPalette().isEmpty()) {
                    setCurrentColor(loaded.getPalette().get(0));
                }
                view.refreshPalette();
                JOptionPane.showMessageDialog(view, "Loaded successfully!");
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(view, "Error: " + ex.getMessage());
            }
        }
    }
}
