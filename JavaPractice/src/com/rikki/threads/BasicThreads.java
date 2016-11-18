package com.rikki.threads;

public class BasicThreads {

	public static void main(String[] args) throws InterruptedException {
		// create 2 threads
		// implements runnable? 	pass to Thread()
		Thread job = new Thread(new Job());
		
		// extends Thread? 	make the object
		Work work = new Work();
		
		// configure the thread before we start
		job.setPriority(Thread.MAX_PRIORITY);
		work.setPriority(1);
		Thread main = Thread.currentThread();
		main.setPriority(1);
		
		job.start();	// JVM creates new stack space for the thread job
		work.start();
		for(; ;){
			System.out.println("Main is  running..");
			// randomly escape
			if ( Math.random() > .8){
				break;
			}
		}
		
		job.join();	// main pauses until job thread joins
		work.join();
		// only occurs when all threads are done
		System.out.println("All threads are complete!");
	}
}

class Job implements Runnable{

	@Override
	// what happens when we start the thread
	public void run() {
		for(; ;) {
			System.out.println("Job is  running..");
			// randomly escape
			if ( Math.random() > .8){
				break;
			}
		}
	}
}

class Work extends Thread{
	@Override
	public void run() {
		while(true){
			System.out.println("Work is running..");
			//randomly escape
			if ( Math.random() > .8){
				break;
			}
		}
	}
}