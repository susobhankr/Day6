package com.bridgelaz;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int firstTerm=0;
		int secondTerm=1;

		Scanner sc = new Scanner(System.in);  

		System.out.println("Enter the value of A :");
		int number= sc.nextInt();

		for (int i=0; i <= number; ++i ) {
			int	nextTerm = firstTerm + secondTerm ;
			firstTerm = secondTerm;
			secondTerm = nextTerm ;

			System.out.println("The value of fibanocci series is :" + nextTerm);

		}
	}
}
