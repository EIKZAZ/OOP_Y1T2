import javax.swing.*;
import java.awt.*;
public class CalculatorOneGUI {
    JFrame f = new JFrame("Calculator");
    JPanel p = new JPanel( );
    TextField txt1 = new TextField();
    TextField txt2 = new TextField();
    TextField txt4 = new TextField();
    JButton b1 = new JButton("Plus");
    JButton b2 = new JButton("Subtract");
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
        
        f.add(txt4);
        f.setVisible(true);
    }
}
