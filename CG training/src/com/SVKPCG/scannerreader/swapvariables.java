package com.SVKPCG.scannerreader;

public class swapvariables {

	public static void main(String[] args) {
	int x=200;
	int y=300;
	System.out.println("before swap");
	System.out.println("x = " + x);
	System.out.println("y = " + y);
	int temp = y;
	y=x;
	x=temp;
	System.out.println(" after swap");
	System.out.println("x = " + x);
	System.out.println("y = " + y);

	}

}
