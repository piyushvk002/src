import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Calculator implements ActionListener {
    JFrame frame;
    JLabel tf;
    JButton[] btns;
    Container c;
    boolean fluent = false;

    public void run() {
        frame = new JFrame("Calculator");
        c = frame.getContentPane();
        // do something with c
        tf = new JLabel("0");
        tf.setHorizontalAlignment(JLabel.RIGHT);
        c.add(tf, BorderLayout.NORTH);
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 4, 10, 10));
        btns = new JButton[16];
        String[] data = { "7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "*", "C", "0", "=", "/" };
        for (int i = 0; i < btns.length; i++) {
            btns[i] = new JButton(data[i]);
            btns[i].addActionListener(this);
            panel.add(btns[i]);
        }
        c.add(panel);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        calc.run();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JButton clickedButton = (JButton) e.getSource();
        ArrayList<String> ar = new ArrayList<String>();
        ar.add("+");
        ar.add("-");
        ar.add("*");
        ar.add("/");

        if (tf.getText().equals("0") || (fluent && (!ar.contains(clickedButton.getText())))) {
            tf.setText("");
        } else if (clickedButton.getText().equals("C")) {
            tf.setText("0");
            return;
        } else if (clickedButton.getText().equals("=")) {
            try {
                String operation = tf.getText();
                if (operation.contains("+")) {

                    String[] numbers = operation.split("\\+");
                    System.out.println(numbers);
                    int[] realNums = new int[numbers.length];
                    for (int i = 0; i < numbers.length; i++) {
                        realNums[i] = Integer.parseInt(numbers[i]);
                    }
                    int sum = 0;
                    for (int i : realNums) {
                        sum += i;
                    }
                    tf.setText(Integer.toString(sum));
                    fluent = true;

                    return;
                }
                if (operation.contains("*")) {
                    String[] numbers = operation.split("\\*");
                    int[] realNums = new int[numbers.length];
                    for (int i = 0; i < numbers.length; i++) {
                        realNums[i] = Integer.parseInt(numbers[i]);
                    }
                    int sum = realNums[0];
                    for (int i = 1; i < realNums.length; i++) {
                        sum *= realNums[i];
                    }
                    tf.setText(Integer.toString(sum));
                    fluent = true;
                    return;
                }
                if (operation.contains("-")) {
                    String[] numbers = operation.split("-");
                    int[] realNums = new int[numbers.length];
                    for (int i = 0; i < numbers.length; i++) {
                        realNums[i] = Integer.parseInt(numbers[i]);
                    }
                    int sum = realNums[0];
                    for (int i = 1; i < realNums.length; i++) {
                        sum -= realNums[i];
                    }
                    fluent = true;

                    tf.setText(Integer.toString(sum));
                    return;
                }
                if (operation.contains("/")) {
                    String[] numbers = operation.split("/");
                    int[] realNums = new int[numbers.length];
                    for (int i = 0; i < numbers.length; i++) {
                        realNums[i] = Integer.parseInt(numbers[i]);
                    }
                    int sum = realNums[0];
                    for (int i = 1; i < realNums.length; i++) {
                        sum /= realNums[i];
                    }
                    tf.setText(Integer.toString(sum));
                    fluent = true;
                    return;
                }
            } catch (ArithmeticException a) {
                JOptionPane.showMessageDialog(c, "Not more than binary operations", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        tf.setText(tf.getText() + clickedButton.getText());
        fluent = false;
    }
}
