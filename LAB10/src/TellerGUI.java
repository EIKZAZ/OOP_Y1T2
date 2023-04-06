import javax.swing.*;
import java.awt.*;
public class TellerGUI {
    JFrame f = new JFrame("Teller GUI");
    JPanel p1 = new JPanel( );
    JPanel p2 = new JPanel( );
    JPanel p3 = new JPanel( );
    JLabel l1 = new JLabel("Balance");
    TextField txt1 = new TextField("6000");
    JLabel l2 = new JLabel("Amount");
    TextField txt2 = new TextField();
    JButton b1 = new JButton("Deposit");
    JButton b2 = new JButton("Withdraw");
    JButton b3 = new JButton("Exit");
    public TellerGUI() {
        f.setSize(300,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new GridLayout(4, 1));
        p1.setLayout(new GridLayout(1,2));
        p1.add(l1);
        p1.add(txt1);
        txt1.setEnabled(false);
        p2.setLayout(new GridLayout(1,2));
        p2.add(l2);
        p2.add(txt2);
        p3.setLayout(new FlowLayout());
        p3.add(b1);
        p3.add(b2);
        p3.add(b3);
        f.add(p1);
        f.add(p2);
        f.add(p3);
        f.setVisible(true);
    }
}
