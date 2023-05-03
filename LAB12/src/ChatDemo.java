import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.io.*;

public class ChatDemo implements ActionListener, WindowListener{
    private JFrame fr;
    private JPanel p;
    private JTextArea ta;
    private JTextField tf;
    private JButton b1,b2;
    
    public ChatDemo() {
        fr = new JFrame();
        p = new JPanel();
        p.setLayout(new FlowLayout());
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        ta = new JTextArea(20,45);
        tf = new JTextField(45);
        ta.setEditable(false);
        b1 = new JButton("Submit");
        b2 = new JButton("Reset");
        
        fr.add(ta, BorderLayout.NORTH);
        fr.add(tf, BorderLayout.CENTER);
        p.add(b1);
        p.add(b2);
        fr.add(p, BorderLayout.SOUTH);
        
        fr.addWindowListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        
        fr.pack();
        fr.setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource().equals(b1)) {
            DateTimeFormatter date = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
            ta.setText(ta.getText() + date.format(LocalDateTime.now()) + ": " + tf.getText() + "\n");
            tf.setText("");
        } else if(ae.getSource().equals(b2)) {
            ta.setText("");
        }
    }
    public void windowClosing(WindowEvent we){
        try(FileOutputStream fout = new FileOutputStream("ChatDemo.dat");) {
            for(int i = 0; i < ta.getText().length(); i++){
                fout.write(ta.getText().charAt(i));
            }
            //System.out.println("Done");
        } catch (FileNotFoundException e) { 
            System.out.println(e);
            try{
                File ChatDemo = new File("ChatDemo.dat");
                ChatDemo.createNewFile();
                //System.out.println("Creat File");
            }catch(IOException e2){
                //System.out.println("can't create file : " + e2);
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
    @Override
    public void windowOpened(WindowEvent we){
        if(new File("ChatDemo.dat").exists()){
            try(FileInputStream fin = new FileInputStream("ChatDemo.dat");){
                int i = fin.read();
                while(i != -1){
                    ta.setText(ta.getText()+ (char)i);
                    i = fin.read();
                }
            }catch(IOException e){
                //System.out.println(e);
            }
        }
    }
    public void windowDeactivated(WindowEvent we){}
    public void windowActivated(WindowEvent we){}
    public void windowDeiconified(WindowEvent we){}
    public void windowIconified(WindowEvent we){}
    public void windowClosed(WindowEvent we){}
}
