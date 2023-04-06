import javax.swing.*;
import java.awt.*;
public class MDIFromGUI {
    JFrame f = new JFrame("SubMenuItem Demo");
    JMenuBar mb = new JMenuBar();
    JMenu m1 = new JMenu("File");
    JMenu m2 = new JMenu("Edit");
    JMenu m3 = new JMenu("View");
    JMenu m4 = new JMenu("New");
    JMenuItem mi1 = new JMenuItem("Open");
    JMenuItem mi2 = new JMenuItem("Save");
    JMenuItem mi3 = new JMenuItem("Exit");
    JMenuItem mi4 = new JMenuItem("Window");
    JMenuItem mi5 = new JMenuItem("Message");
    
    JDesktopPane desktopPane = new JDesktopPane();
    JInternalFrame internalFrame1 = new JInternalFrame("Application01",false,false,false,true);
    JInternalFrame internalFrame2 = new JInternalFrame("Application02",false,false,false,true);
    JInternalFrame internalFrame3 = new JInternalFrame("Application03",false,false,false,true);
    public MDIFromGUI() {
        f.setSize(1000,1000);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        m1.setMnemonic('F');
        f.setJMenuBar(mb);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        m1.add(m4);
        m1.add(mi1);
        m1.addSeparator();
        m1.add(mi2);
        m1.addSeparator();
        m1.add(mi3);
        m4.add(mi4);
        m4.addSeparator();
        m4.add(mi5);
        
        internalFrame1.setSize(200, 200);
        internalFrame1.pack();
        internalFrame1.setVisible(true);

        desktopPane.add(internalFrame1);
        desktopPane.setBackground(Color.black);
        f.add(desktopPane);
        f.setVisible(true);
    }
}
