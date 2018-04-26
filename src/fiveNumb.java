//Maurice Hanns CSC 242 04/25/2018

import java.util.Scanner;

public class fiveNumb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int [] values = new int[5];
		
		for (int i = 0; i < values.length; i++){
			
			System.out.println("Enter number <" + (i+1) + "> to be summed: ");
			values[i] = scanner.nextInt();
			//System.out.println(values[i]);
				
		}//for loop
				
		for (int i = 0; i < values.length; i++){
			
			if (values[i]%4 == 0 && values[i]%5 == 0 && values[i] > 10){
				System.out.println(values[i]);
			}
			else{
				
			}
				
		}//for loop

		System.out.println("Total of all the values: ");
		
	}//main

}//class
