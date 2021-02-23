/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.TimerTask;

/**
 *
 * @author Amar
 */
public class MyTimeTask extends TimerTask {
    public void run()
    {
      String username = "amaramkooooo@gmail.com";
		String password = "Mnb12345!";

		MailSender sender = new MailSender();
		sender.login("smtp.gmail.com", "587", username, password);

		try {

			sender.send("amaramkooooo@gmail.com", "Absender Amar Planincic", "amaramko@live.com", "Test Test Test Betreff",
					"your appointment is in one day !!!");

		} catch (Exception e) {
			e.printStackTrace();
		}
    }
}
