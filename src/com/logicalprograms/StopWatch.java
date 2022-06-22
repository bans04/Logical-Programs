package com.logicalprograms;

import java.util.Scanner;

public class StopWatch {
	public long startTimer=0;
	public long stopTimer=0;
	public long elapsed;
	
	public void start(){
		startTimer=System.currentTimeMillis();
		System.out.println("Start Time is: "+startTimer);
	}
	
	public void stop(){
		stopTimer=System.currentTimeMillis();
		System.out.println("Stop Time is: "+stopTimer);
	}
	
	public long getTime(){
		elapsed=stopTimer-startTimer;
		return elapsed;
	}

	public static void main(String[] args) {
		StopWatch sw=new StopWatch();
		System.out.print("Press any num to Start Time: ");
		Scanner sc = new Scanner(System.in);
		int u = sc.nextInt();
		sw.start();

		System.out.print("Press any num to Stop Time: ");
		int u1 = sc.nextInt();
		sw.stop();

		long l=sw.getTime();
		System.out.println("Total Time (in millisec) is:"+l);
		System.out.println("Converting millisec to seconds: "+(l/1000)+" sec");
		
	}
}
