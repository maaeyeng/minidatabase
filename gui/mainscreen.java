//Usually you will require both swing and awt packages
// even if you are working with just swings.
import javax.swing.*;
import java.awt.*;
class mainscreen {
    public static void main(String args[]) {
         int maxX = 500;
         int maxY = 500;
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        maxX = screenSize.width - 100;//www  . j  a v  a  2  s  . c  o  m
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
        JMenu m4 = new JMenu("Tools");
        JMenu m5 = new JMenu("Helps");
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        mb.add(m4);
        mb.add(m5);
        JMenuItem m11 = new JMenuItem("New Project");
        JMenuItem m22 = new JMenuItem("Connect Database");
        JMenuItem m33 = new JMenuItem("Exit");
        m1.add(m11);
        m1.add(m22);
        m1.add(m33);
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