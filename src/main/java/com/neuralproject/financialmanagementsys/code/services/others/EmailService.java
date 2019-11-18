package com.neuralproject.financialmanagementsys.code.services.others;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.mail.*;
import javax.mail.internet.*;
import java.io.IOException;
import java.util.Date;
import java.util.Properties;


@Service
public class EmailService {

    @Value("${mailservice.email}")
    public String email ;
    @Value("${mailservice.password}")
    public String emailPassword ;

    
    public void sendMail(String mailBody, String toReceiver , String Subejct) throws AddressException, MessagingException, IOException {


        Session session = Session.getInstance(getProperties(), new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(email, emailPassword);
            }
        });

        Message msg = new MimeMessage(session);
        msg.setFrom(new InternetAddress("keemsisi@gmail.com", false));

        msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toReceiver));
        msg.setSubject("EasySocial Purchase Notification");
        msg.setContent("A message sent to you!", "text/html");
        msg.setSentDate(new Date());

        MimeBodyPart messageBodyPart = new MimeBodyPart();
        messageBodyPart.setContent("Tutorials point email", "text/html");

        Multipart multipart = new MimeMultipart();
        multipart.addBodyPart(messageBodyPart);
        MimeBodyPart attachPart = new MimeBodyPart();

        attachPart.attachFile("/var/tmp/image19.png");
        multipart.addBodyPart(attachPart);
        msg.setContent(multipart);
        Transport.send(msg);

    }



    public Properties getProperties () {
        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        return props ;

    }
}
