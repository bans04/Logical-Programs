package com.logicalprograms;
import java.util.Scanner;
/*
 * Reversed the enter num by user
 * 
 * @Dnyandeo Bansode
 * 
 * */
public class ReversedNum {
	public void getReversedNum(int num) {
		int reminder;
		int reversedNum = 0;
		while(num > 0) {
			reminder = num % 10;
			//System.out.println(reminder);
			reversedNum = reversedNum * 10 + reminder;
			num = num/10;
		}
		System.out.println(reversedNum + " is Reversed num..|");
	}

	public static void main(String[] args) {
		ReversedNum reversedNum = new ReversedNum();
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter num that U want to do Reversed..|");
		int num = scanner.nextInt();
		System.out.println(num + " is Original num..|");
		
		reversedNum.getReversedNum(num);
	}
}
