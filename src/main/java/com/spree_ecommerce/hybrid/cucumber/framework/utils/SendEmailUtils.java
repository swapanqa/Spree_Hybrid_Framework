package com.spree_ecommerce.hybrid.cucumber.framework.utils;


import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.SimpleEmail;
import org.openqa.selenium.WebDriver;

/**
 * Created by Debajyoti Paul on 4/17/2018 at 6:00 PM
 */
public class SendEmailUtils extends UtilsController {

    public SendEmailUtils(WebDriver driver) {
        super(driver);
    }

    public static void emailReport(String sendTo, String subject, String message){
        Email email = new SimpleEmail();
        try {
            email.setHostName("smtp.gmail.com");
            email.setSmtpPort(465);
            email.setAuthenticator(new DefaultAuthenticator("selenium2018paul@gmail.com", "seleniumdebajyoti"));
            email.setSSLOnConnect(true);
            email.setFrom("debajyoti007@gmail.com");
            email.setSubject(subject);
            email.setMsg(message);
            email.addTo(sendTo);
            email.send();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
