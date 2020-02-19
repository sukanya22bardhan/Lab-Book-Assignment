package com.cg.iter;

import java.util.Scanner;

public class Summinglab4 {

	public static int Summinglab4(int n) {
		int sum=0,r;
		
		while(n>0)
		{
			r=n%10;
			sum=(int) (sum+Math.pow(r, 3));
			n=n/10;
		}
		return sum;
	
	}

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n;
		System.out.println("Enter a number");
		n=sc.nextInt();
		System.out.println(Summinglab4(n));
	}

}
