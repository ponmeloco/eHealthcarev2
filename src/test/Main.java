package test;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.WindowConstants;



public class Main {
    public static void main(String[] args) throws SQLException, ParseException {
 
        // creates three different Connection objects
       /* Connection conn1 = null;
        Connection conn2 = null;
        Connection conn3 = null;
 
        try {
            // connect way #1
            String url1 = "jdbc:mysql://localhost:3306/db_ws_20";
            String user = "root";
            String password = "Amaramko123!";
 
            conn1 = DriverManager.getConnection(url1, user, password);
            if (conn1 != null) {
                System.out.println("Connected to the database test1");
            }}catch (SQLException ex) {
            System.out.println("An error occurred. Maybe user/password is invalid");
            ex.printStackTrace();
        }
       ForgotPassword frame1 = new ForgotPassword();
       frame1.setVisible(true);*/
       //Physician One = new Physician();
       //One.setVisible(true);
      //temp one=new  temp();
      //one.setVisible(true);
  // proba one =new proba();
 // siglePanel one= new siglePanel();
   //  one.setVisible(true);
     //the Date and time at which you want to execute
 
    /*----------------------------------------------------------------------
     DateFormat dateFormatter = new SimpleDateFormat("yyyyMMddHHmmss");
    Date date = dateFormatter .parse("20210128170900");

   // create the time and schedule it
    Timer timer = new Timer();

    timer.schedule(new MyTimeTask(), date);  
-----------------------------------------------------
        DateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy HH:mm:ss");
        Calendar cal = Calendar.getInstance();
        System.out.println(dateFormat.format(cal.getTime()));*/
     
    v3PhyGUI one=new v3PhyGUI();
    one.setLocationRelativeTo(null);
   
     one.setVisible(true);
   
    }
}
