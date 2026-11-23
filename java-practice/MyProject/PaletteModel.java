package MyProject;

import java.awt.Color;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PaletteModel implements Serializable {
    private static final long serialVersionUID = 1L;
    private final List<Color> colors = new ArrayList<>();
    private Color currentColor = Color.WHITE;

    public void setCurrentColor(Color c) { this.currentColor = c; }
    public Color getCurrentColor() { return currentColor; }
    public void addColor(Color c) { colors.add(c); }
    public List<Color> getPalette() { return new ArrayList<>(colors); }

    public void saveToFile(File file) throws IOException {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(this);
        }
    }

    public static PaletteModel loadFromFile(File file) throws IOException, ClassNotFoundException {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            return (PaletteModel) ois.readObject();
        }
    }
}
