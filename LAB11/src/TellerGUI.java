import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class TellerGUI implements ActionListener{
    private JFrame f;
    private JPanel p1,p2,p3;
    private JLabel l1,l2;
    private TextField txt1,txt2;
    private JButton b1,b2,b3;
    private Account acct;
    
    public TellerGUI() {
        acct = new Account(6000,"EIK"); 
        f = new JFrame("Teller GUI");
        p1 = new JPanel( );
        p2 = new JPanel( );
        p3 = new JPanel( );
        l1 = new JLabel("Balance");
        txt1 = new TextField(acct.getBalance() + "");
        l2 = new JLabel("Amount");
        txt2 = new TextField();
        b1 = new JButton("Deposit");
        b2 = new JButton("Withdraw");
        b3 = new JButton("Exit");
        
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
        
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        
        f.pack();
        f.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(b1)) {
            txt1.setText(acct.getBalance() + Double.parseDouble(txt2.getText()) + "");
            acct.setBalance(acct.getBalance() + Double.parseDouble(txt2.getText()));
        } else if (ae.getSource().equals(b2) && acct.getBalance() >= Integer.parseInt(txt2.getText()) && Integer.parseInt(txt2.getText()) >= 0) {
            txt1.setText(acct.getBalance() - Double.parseDouble(txt2.getText()) + "");
            acct.setBalance(acct.getBalance() - Double.parseDouble(txt2.getText()));
        } else if (ae.getSource().equals(b3)) {
            System.exit(0);
        }
            
    }
}
