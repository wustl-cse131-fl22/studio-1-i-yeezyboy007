package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("The first of two integers to be averaged");
		double n1 = in.nextInt();
		System.out.print("The second of two integers to be averaged");
		double n2= in.nextInt();
		double average = (n1+n2/2);
		System.out.print(average);
				
				
		
	}

}
