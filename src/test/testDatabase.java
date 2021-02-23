/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.*;
import javax.swing.table.DefaultTableModel; 



public class testDatabase {
   
   
    
    public int countAppointmentRequests (){
         int requests=0;
    try{
   
   Connection con=null;
   con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ehealth","root","Amaramko123!");
    Statement st = (Statement) con.createStatement(); 
  
    String sql="select count(*) from  appointmentrequest";
    ResultSet rs = st.executeQuery(sql);
    rs.next();
    requests=rs.getInt(1);
       
    con.close();
   }catch(Exception e){
       System.out.println("error");
   }
   return requests;
    }
    
    
    
    public String  getUsername(double ID){
     
        String a=null;
   try{
   
   Connection con=null;
   con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ehealth","root","Amaramko123!");
    Statement st = (Statement) con.createStatement(); 
  
    String sql="select * from appointmentrequest where id='"+ID+"'";
    ResultSet rs = st.executeQuery(sql);
    while(rs.next()){
        a= rs.getString("patientName");
     }
    
    con.close();
   }catch(Exception e){
       System.out.println("error");
   }
   return a;
   }
    
    public String  getAge(double ID){
     
        String a=null;
   try{
   
   Connection con=null;
   con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ehealth","root","Amaramko123!");
    Statement st = (Statement) con.createStatement(); 
  
    String sql="select * from appointmentrequest where id='"+ID+"'";
    ResultSet rs = st.executeQuery(sql);
    while(rs.next()){
        a= rs.getString("age");
     }
    
    con.close();
   }catch(Exception e){
       System.out.println("error");
   }
   return a;
   }
    
    public String  gethealthproblem(double ID){
     
        String a=null;
   try{
   
   Connection con=null;
   con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ehealth","root","Amaramko123!");
    Statement st = (Statement) con.createStatement(); 
  
    String sql="select * from appointmentrequest where id='"+ID+"'";
    ResultSet rs = st.executeQuery(sql);
    while(rs.next()){
        a= rs.getString("healthproblem");
     }
    
    con.close();
   }catch(Exception e){
       System.out.println("error");
   }
   return a;
   }
    
    public String  getsuggestedappointmentdate(double ID){
     
        String a=null;
   try{
   
   Connection con=null;
   con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ehealth","root","Amaramko123!");
    Statement st = (Statement) con.createStatement(); 
  
    String sql="select * from appointmentrequest where id='"+ID+"'";
    ResultSet rs = st.executeQuery(sql);
    while(rs.next()){
        a= rs.getString("suggestedappointmentdate");
     }
    
    con.close();
   }catch(Exception e){
       System.out.println("error");
   }
   return a;
   }
    
    public String  getEmail(double ID){
     
        String a=null;
   try{
   
   Connection con=null;
   con=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ehealth","root","Amaramko123!");
    Statement st = (Statement) con.createStatement(); 
  
    String sql="select * from appointmentrequest where id='"+ID+"'";
    ResultSet rs = st.executeQuery(sql);
    while(rs.next()){
        a= rs.getString("eMail");
     }
    
    con.close();
   }catch(Exception e){
       System.out.println("error");
   }
   return a;
   }
    
    
    
}

