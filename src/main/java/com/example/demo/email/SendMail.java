package com.example.demo.email;

import java.util.Properties;
import java.util.Scanner;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {

	public static void main(String[] args) {

		String subject = "Test Mail";
		String message = "Test mail message";

		String username;
		String password;
		String toAddress;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter ToAddress:");
		toAddress = sc.nextLine();

		System.out.println("Enter FromAddress:");
		username = sc.nextLine();

		System.out.println("Enter pwd:");
		password = sc.nextLine();
		sc.close();

		send(username, message, toAddress, subject, toAddress);
	}

	public static void send(String username, String password, String toAddress, String subject, String msg) {

		// Get properties object
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.port", "465");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

		// get Session
		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		// compose message
		try {
			MimeMessage message = new MimeMessage(session);
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(toAddress));
			message.setSubject(subject);
			message.setText(msg);
			// send message
			Transport.send(message);
			System.out.println("message sent successfully");
		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}
	}
}
