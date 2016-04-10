package session2;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		
		int age;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter your Age : ");
		age = s.nextInt();
		
		if (age >= 18)
			System.out.println("You are elligible to vote");
		else
			System.out.println("You are NOT elligible to vote");
	}

}
