package Assignment1;

import java.util.Scanner;

public class FactorialUsingWhile {
	// Finding Factorial using while loop.
	public static void main(String[] args) {
		//number to calculate the factorial 
		int n;
		
		Scanner input;
		input = new Scanner(System.in);
		
		System.out.print("Please, enter the number to calculate the factorial: ");
		n = input.nextInt();
		
		int total;
		
		if(n == 0) {
			total = 0;
		}else {
			total = 1;
		}
		
		while(n > 0) {
			total *= n;
			n--;
		}
		
		System.out.print("The factorial is: " + total);
		
	}
}
