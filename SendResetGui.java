import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SendResetGui implements ActionListener {
    static JTextArea text;
    static JTextField tf;
    static JButton sendBtn, resetBtn;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Chat Frame");
        JMenuBar menuBar = new JMenuBar();
        JMenu file = new JMenu("FILE", false);
        JMenu help = new JMenu("Help", false);
        menuBar.add(file);
        menuBar.add(help);

        file.add(new JMenuItem("Open", 'o'));
        file.add(new JMenuItem("Save As", 's'));

        frame.setJMenuBar(menuBar);

        text = new JTextArea(0, 0);
        frame.add(text);
        JPanel panel = new JPanel();
        panel.add(new JLabel("Enter Text : "));
        tf = new JTextField(12);
        sendBtn = new JButton("Send");
        sendBtn.addActionListener(new SendResetGui());
        resetBtn = new JButton("Reset");
        resetBtn.addActionListener(new SendResetGui());
        panel.add(tf);
        panel.add(sendBtn);
        panel.add(resetBtn);
        frame.add(panel, BorderLayout.SOUTH);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(SendResetGui.sendBtn)) {
            String str = SendResetGui.tf.getText();
            SendResetGui.text.setText(str);
            System.out.println("Hello");
        } else if (e.getSource().equals(SendResetGui.resetBtn)) {
            SendResetGui.tf.setText("");
            System.out.println("Hola");
        }
    }
}