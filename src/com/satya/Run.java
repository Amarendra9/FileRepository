package com.satya;

public class Run {

	public static void main(String[] args) {
		int x = 10;
        int y = 20, temp;
        System.out.println("Before swap:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);
        temp = x;
        x=y;
        y=temp;
        System.out.println("After swap:");
        System.out.println("x value: "+x);
        System.out.println("y value: "+y);


	}

}
