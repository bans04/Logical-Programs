package com.logicalprograms;
import java.util.Scanner;
/*
 * Check entered num whether it is prime or not
 * 
 * @Dnyandeo Bansode
 * 
 */

public class PrimeNum {
	public void checkPrimeNum(int num) {
		int count = 0;
		for(int i = 2; i < num; i++) {
			if(num % i == 0) {
			    count++;
			}
		}
		
		if(count > 0) {
			System.out.println(num + " is not prime num..|");
		}else {
			System.out.println(num + " is a Prime num..|");
		}
	}

	public static void main(String[] args) {
		PrimeNum primeNum = new PrimeNum();
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter num which U want to check whether it is Prime or not:-> ");
		int num = scanner.nextInt();
		
		primeNum.checkPrimeNum(num);
	}
}
