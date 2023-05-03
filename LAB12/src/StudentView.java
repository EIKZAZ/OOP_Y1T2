import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class StudentView implements ActionListener,WindowListener{
    private JFrame f;
    private JPanel p1,p2;
    private JButton b1,b2;
    private JLabel l1,l2,l3;
    private JTextField txt1,txt2,txt3;
    private Student s;
    
    public StudentView() {
        s = new Student();
        f = new JFrame();
        l1 = new JLabel("ID:");
        l2 = new JLabel("Name:");
        l3 = new JLabel("Money:");
        txt1 = new JTextField();
        txt2 = new JTextField();
        txt3 = new JTextField("" + s.getMoney());
        p1 = new JPanel( );
        p2 = new JPanel( );
        b1 = new JButton("Deposit");
        b2 = new JButton("Withdraw");
        
        txt3.setEditable(false);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new BorderLayout());
        f.add(p1,BorderLayout.CENTER);
        f.add(p2,BorderLayout.SOUTH);
        p1.setLayout(new GridLayout(3,2));
        p1.add(l1); p1.add(txt1);
        p1.add(l2); p1.add(txt2);
        p1.add(l3); p1.add(txt3);
        p2.setLayout(new FlowLayout());
        p2.add(b1); p2.add(b2);
        
        f.addWindowListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        f.pack();
        f.setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        try{
            s.setID(Integer.parseInt(txt1.getText()));
            s.setName(txt2.getText());
            if(ae.getSource().equals(b1)){
                s.setMoney(s.getMoney() + 100);
            }else if(ae.getSource().equals(b2)){
                if (s.getMoney() >= 100) {
                s.setMoney(s.getMoney() - 100);
                }
            }
            //txt1.setText(s.getID()+"");
            //txt2.setText(s.getName());
            txt3.setText(s.getMoney()+ "");
        }catch(Number­Format­Exception ex){
            System.out.println("Please Enter correct info");
        }
    }
    
    public void windowClosing(WindowEvent we){
        try (FileOutputStream fos = new FileOutputStream("StudentM.dat");
                ObjectOutputStream oos = new ObjectOutputStream(fos);) {
            oos.writeObject(s);
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
    
    public void windowOpened(WindowEvent we){
        if (new File ("StudentM.dat").exists()) {
            try (FileInputStream fis = new FileInputStream("StudentM.dat");
                ObjectInputStream ois = new ObjectInputStream(fis);) {
            s = (Student) ois.readObject();
            txt1.setText(s.getID() + "");
            txt2.setText(s.getName() + "");
            txt3.setText(s.getMoney() + "");
            }
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    public void windowDeactivated(WindowEvent we){}
    public void windowActivated(WindowEvent we){}
    public void windowDeiconified(WindowEvent we){}
    public void windowIconified(WindowEvent we){}
    public void windowClosed(WindowEvent we){}
}


    
