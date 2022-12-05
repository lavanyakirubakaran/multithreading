package com.java1;

public class TestDaemonThread1 extends Thread{ 
	public void run(){ 
		 if(Thread.currentThread().isDaemon()){//checking for daemon thread 
		 System.out.println("daemon thread work"); 
		 }else{ 
		System.out.println("user thread work");}} 
		public static void main(String[] args){ // main thread
		 TestDaemonThread1 t1=new TestDaemonThread1();//creating thread1 
		 TestDaemonThread1 t2=new TestDaemonThread1(); //thread 2
		 TestDaemonThread1 t3=new TestDaemonThread1(); //thread 3
		 t1.setDaemon(true);
		 t2.setDaemon(true);//now t1 is daemon thread 
		 t1.start();//starting threads 
		 t2.start(); t3.start(); }}


