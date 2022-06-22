package com.logicalprograms;
import java.util.Scanner;
/*
 * Check whether the entered numis perfect num or not
 * 
 * @Dnyandeo Bansode
 * 
 * */

public class PerfectNum {
	public void getPerfectNum(int num) {
		int sum = 0;
		for(int i = 1; i < num; i++) {
			if(num % i == 0) {
				sum+= i;
			}
		}
		if(sum == num) {
			System.out.println(num + " is Perfect Num..|");
		}else {
			System.out.println(num + " is not Perfect num..|");
		}
	}

	public static void main(String[] args) {
		PerfectNum perfectNum = new PerfectNum();
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter num to check whether it is Perfect num or not:-> ");
		int num = scanner.nextInt();
		perfectNum.getPerfectNum(num);
	}
}
