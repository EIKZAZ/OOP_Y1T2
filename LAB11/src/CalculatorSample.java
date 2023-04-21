import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class CalculatorSample implements ActionListener{
    private JFrame f;
    private JPanel p;
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
    private TextField txt1;
    private String operator;
    private double num1,num2,result = 0;
    
    public CalculatorSample() {
        f = new JFrame("My Calculator");
        p = new JPanel( );
        txt1 = new TextField();
        b1 = new JButton("1");
        b2 = new JButton("2");
        b3 = new JButton("3");
        b4 = new JButton("4");
        b5 = new JButton("5");
        b6 = new JButton("6");
        b7 = new JButton("7");
        b8 = new JButton("8");
        b9 = new JButton("9");
        b10 = new JButton("0");
        b11 = new JButton("C");
        b12 = new JButton("=");
        b13 = new JButton("+");
        b14 = new JButton("-");
        b15 = new JButton("x");
        b16 = new JButton("/");
        
        f.setSize(400, 400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new BorderLayout());
        f.add(txt1, BorderLayout.NORTH);
        p.setLayout(new GridLayout(4,4));
        
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(b13);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b14);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b15);
        p.add(b10);
        p.add(b11);
        p.add(b12);
        p.add(b16);
        f.add(p);
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        
        f.pack();
        f.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(b1)){
            txt1.setText(txt1.getText() + 1);
        } else if (ae.getSource().equals(b2)){
            txt1.setText(txt1.getText() + 2);
        } else if (ae.getSource().equals(b3)){
            txt1.setText(txt1.getText() + 3);
        } else if (ae.getSource().equals(b4)){
            txt1.setText(txt1.getText() + 4);
        } else if (ae.getSource().equals(b5)){
            txt1.setText(txt1.getText() + 5);
        } else if (ae.getSource().equals(b6)){
            txt1.setText(txt1.getText() + 6);
        } else if (ae.getSource().equals(b7)){
            txt1.setText(txt1.getText() + 7);
        } else if (ae.getSource().equals(b8)){
            txt1.setText(txt1.getText() + 8);
        } else if (ae.getSource().equals(b9)){
            txt1.setText(txt1.getText() + 9);
        } else if (ae.getSource().equals(b10)){
            txt1.setText(txt1.getText() + 0);
        } else if (ae.getSource().equals(b11)) {
            txt1.setText("");
        } else if (ae.getActionCommand().equals("+")) {
            operator = "+";
            num1 = Double.parseDouble(txt1.getText());
            txt1.setText("");
        } else if (ae.getActionCommand().equals("-")) {
            operator = "-";
            num1 = Double.parseDouble(txt1.getText());
            txt1.setText("");
        } else if (ae.getActionCommand().equals("x")) {
            operator = "*";
            num1 = Double.parseDouble(txt1.getText());
            txt1.setText("");
        } else if (ae.getActionCommand().equals("/")) {
            operator = "/";
            num1 = Double.parseDouble(txt1.getText());
            txt1.setText("");
        } else if (ae.getActionCommand().equals("=")) {
            num2 = Double.parseDouble(txt1.getText());
            if (operator == "+"){
                result = num1 + num2;
            } else if (operator == "-"){
                result = num1 - num2;
            } else if (operator == "*"){
                result = num1 * num2;
            } else if (operator == "/"){
                result = num1 / num2;
            }
            txt1.setText(result + "");
        }
    }
}   

