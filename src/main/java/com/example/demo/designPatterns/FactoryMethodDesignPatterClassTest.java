package com.example.demo.designPatterns;

public class FactoryMethodDesignPatterClassTest {

	public static void main(String[] args) {
		Notification notification;
		
		notification = NotificationFactory.getInstance("EMAIL");
		notification.notifyUser();
		
		notification = NotificationFactory.getInstance("SMS");
		notification.notifyUser();
		
		notification = NotificationFactory.getInstance("PUSH");
		notification.notifyUser();
		
	}

}

class NotificationFactory {

	public static Notification getInstance(String channel) {

		Notification notification;

		switch (channel) {
		case "EMAIL":
			notification = new EmailNotification();
			break;
		case "SMS":
			notification = new SMSNotification();
			break;
		case "PUSH":
			notification = new PushNotification();
			break;
		default:
			throw new IllegalArgumentException("Invalid Channel");
		}
		return notification;
	}
}

interface Notification {
	void notifyUser();
}

class EmailNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Sending Email Notification...");
	}
}

class SMSNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Sending SMS Notification...");
	}
}

class PushNotification implements Notification {

	@Override
	public void notifyUser() {
		System.out.println("Sending Push Notification...");
	}
}