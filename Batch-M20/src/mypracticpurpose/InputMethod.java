package mypracticpurpose;

import java.util.Scanner;

public class InputMethod {

	public static void main(String[] args) {
		int a,b,c;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter first Number :");
		a=sc.nextInt();
		System.out.print("Enter second Number :");
		b=sc.nextInt();
		c=a+b;
		System.out.print("Sum is "+c);
		

	}

}
