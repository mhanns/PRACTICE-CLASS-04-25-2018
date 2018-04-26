//Maurice Hanns CSC 242 04/25/2018

import java.util.Scanner;

public class tenNumbs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);

		int [] values = new int[10];
		int sum = values[0];
		
		for (int i = 0; i < values.length; i++){
			
			System.out.println("Enter number <" + (i+1) + "> to be summed: ");
			values[i] = scanner.nextInt();
			//System.out.println(values[i]);
				
		}//for loop
				
		for (int i = 0; i < values.length; i++){
		
			sum = sum + values[i];
			//System.out.println(values[i]);
				
		}//for loop

		System.out.println("Total of all the values: " + sum);
		
	}//main

}//class
