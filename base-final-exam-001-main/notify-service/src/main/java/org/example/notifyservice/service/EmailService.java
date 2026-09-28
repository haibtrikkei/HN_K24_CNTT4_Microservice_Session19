package org.example.notifyservice.service;

import jakarta.mail.internet.MimeMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

public class EmailService {

    private final JavaMailSender mailSender;
    private final String from;

    public EmailService(JavaMailSender mailSender, String from) {
        this.mailSender = mailSender;
        this.from = from;
    }

    public void sendOrderCreatedEmail(String recipient) {
        //Viết code để gửi mail
    }
}
