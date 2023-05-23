import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;

public class ColorGUI {

    static JPanel p;
    static JButton bred = new JButton();
    static JButton bpink = new JButton();
    static JButton bdarkblue = new JButton();
    static JButton bgreen = new JButton();
    static JButton bblue = new JButton();
    static JFrame f;

    ColorGUI() {
        p = new JPanel();
        p.setBackground(Color.RED);
        f.add(p);

    }

    public static void main(String[] args) {
        f = new JFrame();
        f.setSize(500, 500);
        f.setVisible(true);
    }
}