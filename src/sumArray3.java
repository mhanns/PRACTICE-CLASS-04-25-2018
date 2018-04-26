//Maurice Hanns CSC 242 04/25/2018

public class sumArray3 {

	public static void main(String[] args) {
		
		int [] Array1 = {5,2,8,23,14};
		int [] Array2 = {67,32,7,4,61};
		int [] Array3 = new int[5];		
		
		for (int i = 0; i < Array3.length; i++){
				
			Array3[i] = (Array2[i] + Array1[i]); 
							
		}//for loop
		
		for (int i = 0; i < Array3.length; i++){
				
			System.out.println("Sums " + (i+1) + " is: " + Array3[i]);	
	
		}//for loop
			
	}//main
		
}//class