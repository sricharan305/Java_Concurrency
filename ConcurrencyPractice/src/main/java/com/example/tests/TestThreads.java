package com.example.tests;

import com.example.runnables.AppThread;

public class TestThreads {

	public static void main(String[] args) {
		
		AppThread thread1 = new AppThread();
		AppThread thread2 = new AppThread();
		AppThread thread3 = new AppThread();
		
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
