import javax.swing.*;    
import javax.swing.JTable;
import javax.swing.JFrame;
import javax.swing.JButton;
public class CreateTable {    
    public static void main(String[] args) {   

   JFrame f =new JFrame();    
   JLabel tbl = new JLabel("Table Name:");
   tbl.setBounds(20, 50, 100, 20);
   JTextField tbl_n = new JTextField();
   tbl_n.setBounds(20, 100, 100, 20);

    JButton btn_ok = new JButton("Create Table");
   f.add(tbl);
   f.add(tbl_n);
   f.add(btn_ok);
    String data[][]={ {"1","ID","ID","","","",""},    
                          {"2","Name","varchar","255","","",""},       
                          {"3","Sachin","700000","","","",""},    };    
    String column[]={"ID","Filed Name","Type","Size","Description","Remark"};         
    JTable jt=new JTable(data,column);    
    jt.setBounds(20,200,600,500);    
    JScrollPane sp=new JScrollPane(jt);    

    f.add(sp);          
    
    f.setSize(600,600);    
    f.setVisible(true);    
}     
 
  
}    
