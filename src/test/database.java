package test;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

public class database {
   
    
    
     public void displayAppointmentsPhy(javax.swing.JTable table1){
     try{
        Connection con=null;
         con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ehealth","root","Amaramko123!");
       Statement st = (Statement) con.createStatement(); 
        String sql="select * from appointmentrequest";
      ResultSet rs = st.executeQuery(sql);
     while(rs.next()){
      //String id=String.valueOf(rs.getInt("id"));
      String patientName=rs.getString("patientName");   
      String age=rs.getString("age");
      String healthproblem=rs.getString("healthproblem");
      String suggestedappointmentdate=rs.getString("suggestedappointmentdate");
      
      String tbData[]={patientName,age,healthproblem,suggestedappointmentdate};
      DefaultTableModel tblModel=(DefaultTableModel)table1.getModel();
      tblModel.addRow(tbData);
     
     }
     con.close();
       }catch(Exception e){
                            System.out.println("error !");

       }
    }

   public void   displayEditProfilePhy(javax.swing.JTextField userNametxf,String id,javax.swing.JTextField addresstxt,javax.swing.JTextField phonetxt,javax.swing.JTextField eMailtxt){
   try{
     
   Connection con=null;
   con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ehealth","root","Amaramko123!");
    Statement st = (Statement) con.createStatement(); 
  
    String sql="select * from physicianeditprofile where id='"+id+"'";
    ResultSet rs = st.executeQuery(sql);
    while(rs.next()){
     userNametxf.setText(rs.getString("UserName"));
     addresstxt.setText(rs.getString("Address"));
     phonetxt.setText(rs.getString("email"));
     eMailtxt.setText(rs.getString("Phone"));
    
     }
    
    con.close();
   }catch(Exception e){
       System.out.println("error");
   }
   }

   
   
   
   
}
