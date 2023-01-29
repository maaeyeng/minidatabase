//Usually you will require both swing and awt packages
// even if you are working with just swings.
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;  
class mainscreen implements ActionListener {
    public static void main(String args[]) {
         int maxX = 500;
         int maxY = 500;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        maxX = screenSize.width - 100;
        maxY = screenSize.height - 100;

        //Creating the Frame
        JFrame frame = new JFrame("Mini Database");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(maxX, maxY);

        //Creating the MenuBar and adding components
        JMenuBar mb = new JMenuBar();
        JMenu m1 = new JMenu("Projects");
        JMenu m2 = new JMenu("Managers");
        JMenu m3 = new JMenu("Server");
        JMenu m4 = new JMenu("SQL Command");
        JMenu m5 = new JMenu("Terminal");
        JMenu m6 = new JMenu("Tools");
        JMenu m7 = new JMenu("Helps");
        mb.add(m1);
        m1.addActionListener(new ActionListener(){  
          public void actionPerformed(ActionEvent e){  
              System.out.print("Clice Project Menu");
          }  
          });
        mb.add(m2);
        mb.add(m3);
        mb.add(m4);
        mb.add(m5);
        mb.add(m6);
        mb.add(m7);
        JMenuItem m11 = new JMenuItem("New Project");
        JMenuItem m12 = new JMenuItem("Connect Database");
        JMenuItem m13 = new JMenuItem("Exit");
        m1.add(m11);
        m1.add(m12);
        m1.add(m13);
        JMenuItem m21 = new JMenuItem("Setting");
        JMenuItem m22 = new JMenuItem("Backup");
        JMenuItem m23 = new JMenuItem("Restore");
        m2.add(m21);
        m2.add(m22);
        m2.add(m23);
        //Creating the panel at bottom and adding components
        JPanel panel = new JPanel(); // the panel is not visible in output
        //Adding Components to the frame.
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.NORTH, mb);
      //  frame.getContentPane().add(BorderLayout.CENTER, ta);

   frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   frame.setVisible(true);
  }

}