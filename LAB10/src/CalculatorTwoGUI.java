import javax.swing.*;
import java.awt.*;
public class CalculatorTwoGUI {
    JFrame f = new JFrame("My Calculator");
    JPanel p = new JPanel( );
    TextField txt1 = new TextField();
    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    JButton b10 = new JButton("0");
    JButton b11 = new JButton("C");
    JButton b12 = new JButton("=");
    JButton b13 = new JButton("+");
    JButton b14 = new JButton("-");
    JButton b15 = new JButton("x");
    JButton b16 = new JButton("/");
    public CalculatorTwoGUI() {
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
        f.setVisible(true);
    }
}
