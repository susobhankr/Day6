package com.bridgelaz;

import java.util.Scanner;

public class PerfecrNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,  value = 0 ;
		Scanner sc = new Scanner(System.in);		
		System.out.println(" Please Enter The Number: ");
		int number = sc.nextInt();

		for(i = 1 ; i < number ; i++) {
			if(number % i == 0)  {
				value = value + i;
			}
		}
		
		if (value == number) {
			System.out.println(+number+" is a Perfect Number");
		}
		else {
			System.out.println(+number+ " is not a Perfect Number");
		}
	}
}
