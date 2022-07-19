package com.example.demo.java8;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableTest {

	public static void main(String[] args) {

		int size = 5;
		FactorialTask ft = new FactorialTask(size);

		ExecutorService executorService1 = Executors.newSingleThreadExecutor();
		Future<Integer> future = executorService1.submit(ft);

		try {
			
			while (!future.isDone()) {
				System.out.println("Waiting...");
			}
			
			assertEquals(120, future.get().intValue());
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (ExecutionException e) {
			e.printStackTrace();
		}
	}

}

class FactorialTask implements Callable<Integer> {

	int number;

	public FactorialTask(Integer number) {
		this.number = number;
	}

	@Override
	public Integer call() throws Exception {

		int factorialNumber = 1;

		for (int count = number; count > 1; count--) {
			factorialNumber = factorialNumber * count;
		}
		System.out.println("factorialNumber:" + factorialNumber);

		return factorialNumber;
	}
}
