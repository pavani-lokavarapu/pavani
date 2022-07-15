package assignment;

import java.util.Scanner;

public class smallestnum {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("input the first number:");
		double x = in.nextDouble();
		System.out.println("input the second number:");
		double y = in.nextDouble();
		System.out.println("input the third number:");
		double z = in.nextDouble();
		System.out.println("The smallest value is " + smallest(x,y,z)+"\n");
	}
	public static double smallest(double x,double y,double z)
	{
		return Math.min(Math.min(x, y), z);
	}

}
