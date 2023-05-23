import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class NumAddGUI implements ActionListener
{
    static JTextField fn = new JTextField(27);
    static JTextField sn = new JTextField(27);
    static JTextField res = new JTextField(33);
    static JButton add = new JButton("Add", null);
    static JButton clear = new JButton("Clear", null);
    static JButton exit = new JButton("Exit", null);
    static JFrame f;
    public static void main(String[] args)
    {
         f = new JFrame();
        f.setSize(500, 500);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        JPanel bpanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));

        panel.setBorder(BorderFactory.createTitledBorder("Number Addition"));
        
        panel.add(new JLabel("First Number : "));
        panel.add(fn);
        panel.add(new JLabel("Second Number : "));
        panel.add(sn);
        panel.add(new JLabel("     Result : "));
        panel.add(res);
        panel.add(add);
        panel.add(clear);
        f.add(panel);

        
        f.add(bpanel,BorderLayout.SOUTH);
        bpanel.add(exit);

        add.addActionListener(new NumAddGUI());
        clear.addActionListener(new NumAddGUI());
        exit.addActionListener(new NumAddGUI());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(NumAddGUI.add))
        {
            int sum = Integer.parseInt(NumAddGUI.fn.getText())+ Integer.parseInt(NumAddGUI.sn.getText());
            NumAddGUI.res.setText(sum+"");
            System.out.println("sum = "+sum);
        }
        else if(e.getSource().equals(NumAddGUI.clear))
        {
            NumAddGUI.res.setText("");
            NumAddGUI.fn.setText("");
            NumAddGUI.sn.setText("");
        }
        else
        {
            NumAddGUI.f.setVisible(false);;
            
            System.out.println("exit");
        }
    }
}