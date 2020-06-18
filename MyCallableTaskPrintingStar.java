package com.executorService;

import java.util.concurrent.Callable;

public class MyCallableTaskPrintingStar implements Callable {
	private int number;
	
	public MyCallableTaskPrintingStar(int number) {
		this.number = number;
	}
	@Override
	public String call() throws Exception {
		//Thread.sleep(1000);
		System.out.println(number + "  " + Thread.currentThread().getName());
		Thread.sleep(1000);
		return "Completed";
	}
}
