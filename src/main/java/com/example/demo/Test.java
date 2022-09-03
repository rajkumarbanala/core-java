package com.example.demo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		
		Test test = new Test();
		
		test.sendRemainderEmailJob();

	}

	RecordDAO recordDAO = new RecordDAO();

	void sendRemainderEmailJob() {
//		System.out.println("sendRemainderEmailJob()");

		int timePeriod = 3;
		int expiryDateLimit = 30;
		
		for (int count = 0; count <= expiryDateLimit; count += timePeriod) {
			
			System.out.println();
			
			System.out.println("count:" + count);
			
			LocalDateTime expiryDate = LocalDateTime.now();
			expiryDate = expiryDate.plusDays(count);
			
			LocalDateTime endDate = LocalDateTime.now();
			endDate = endDate.plusDays(timePeriod);
			
			DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			
			String expiryDateString = expiryDate.format(dateTimeFormatter);
			System.out.println("expiryDateString:" + expiryDateString);
			
			String endDateString = endDate.format(dateTimeFormatter);
			System.out.println("endDateString:" + endDateString);
			
//			String endDateString = endDate.format(dateTimeFormatter);
//			System.out.println("endDateString:" + endDateString);
			
//			List<Record> list = recordDAO.get(startDate, endDate);

//			sendRemainderEmailJob(list, expiryDateString);
		}
	}

	public void sendRemainderEmailJob(List<Record> list, String expiryDate) {
		System.out.println("sendRemainderEmailJob()");

		if (list == null) {
			System.err.println("list is null");
		}

		for (Record record : list) {
			sendRemainderEmailJob(record, expiryDate);
		}

	}

	public void sendRemainderEmailJob(Record record, String expiryDate) {
		System.out.println("sendRemainderEmailJob()");

		// prepare mail
		String toAddress = record.getEmail();
		String subject = "Application Expiry Notification";
		String body = "Dear User, Your application will expire on " + expiryDate;

		// send mail
		sendMail(toAddress, subject, body);

	}

	public void sendMail(String toAddress, String subject, String body) {
		System.out.println("sendMail()");

		// send mail

	}

}
