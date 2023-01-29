
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class ServerScreen  {
    // Set Frame Screen Server Info
    // Set Component & position on frane label textfiled button 
    // Add component to panel 
    // add panel to frame 
    // show 
    public static void main(String[] args) {  
        JFrame f=new JFrame("Database Server Setting");  

                // initializing the labels   
        JLabel l1 = new JLabel ("Server Name");   
         JLabel l2 = new JLabel ("Port Number");   
              
                // set the location of label  
                l1.setBounds(20,50,100,20);  
                l2.setBounds(20, 100, 100, 20);  

     JTextField sm=new JTextField();  
        sm.setBounds(100,50, 200,20);  
        JTextField portnum =new JTextField();  
        portnum.setBounds(100,100, 200,20);  
  
  


        JButton b=new JButton("Connect..");  
        b.setBounds(50,150,150,30);  
        JButton st=new JButton("Stop..");  
        st.setBounds(200,150,150,30);  
      
        b.addActionListener(new ActionListener(){  
        public void actionPerformed(ActionEvent e){  
                sm.setText("Conneting....");  
        }  
        });  
        f.add(l1);  
        f.add(l2);  
        f.add(b);f.add(st);
        f.add(sm);  f.add(portnum);  
 
        f.setSize(400,300);  
        f.setLayout(null);  
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);   
    }  

}