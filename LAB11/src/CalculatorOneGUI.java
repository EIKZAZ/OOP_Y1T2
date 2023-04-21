import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CalculatorOneGUI implements ActionListener{
    JFrame f = new JFrame("Calculator");
    JPanel p = new JPanel( );
    TextField txt1 = new TextField();
    TextField txt2 = new TextField();
    TextField txt4 = new TextField();
    JButton b1 = new JButton("Plus");
    JButton b2 = new JButton("Minus");
    JButton b3 = new JButton("Multiply");
    JButton b4 = new JButton("Division");
    public CalculatorOneGUI() {
        f.setSize(400,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new GridLayout(4, 1));
        f.add(txt1);
        f.add(txt2);
        
        p.setLayout(new FlowLayout());
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        f.add(p);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        
        f.add(txt4);
        f.pack();
        f.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(b1)){
            txt4.setText(Double.parseDouble(txt1.getText()) + Double.parseDouble(txt2.getText())+ "");
        }else if(ae.getSource().equals(b2)){
            txt4.setText(Double.parseDouble(txt1.getText()) - Double.parseDouble(txt2.getText())+ "");
        }else if(ae.getSource().equals(b3)){
            txt4.setText(Double.parseDouble(txt1.getText()) * Double.parseDouble(txt2.getText())+ "");
        }else if(ae.getSource().equals(b4)){
            txt4.setText(Double.parseDouble(txt1.getText()) / Double.parseDouble(txt2.getText())+ "");
        }
    }

}
