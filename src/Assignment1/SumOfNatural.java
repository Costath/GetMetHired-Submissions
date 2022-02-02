package Assignment1;

import java.util.Scanner;

public class SumOfNatural {
	// Program to find sum of first n (entered by user) natural numbers.
	public static void main(String[] args) {
		//number of natural numbers to be summed 
		int n;
		
		Scanner input;
		input = new Scanner(System.in);
		
		System.out.print("Please, enter the quantity of natural numbers to be summed: ");
		n = input.nextInt();
		
		int total = 0;
		for(int i = 1 ; i <= n; i++) {
			total += i;
		}
		
		System.out.print("The sum of the first " + n + " natural numbers is: " + total);
	}
}
