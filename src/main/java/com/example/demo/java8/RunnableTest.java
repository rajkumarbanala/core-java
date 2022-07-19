package com.example.demo.java8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RunnableTest {
	
	public static void main(String[] args) {
		
		EventLogging event = new EventLogging();
//		Thread t = new Thread(event);
//		t.start();
//		event.run();
		
		ExecutorService executorService1 = Executors.newSingleThreadExecutor();
		executorService1.submit(event);
		executorService1.shutdown();
		
		ExecutorService executorService2 = Executors.newSingleThreadExecutor();
		executorService2.submit(event);
		executorService2.shutdown();
	}
	
}

class EventLogging implements Runnable {

	private static final Logger LOG = LoggerFactory.getLogger(EventLogging.class);

	@Override
	public void run() {
		LOG.debug("run()");
	}

}