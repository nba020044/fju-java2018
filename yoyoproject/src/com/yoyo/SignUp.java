package com.yoyo;

import java.util.Scanner;

public class SignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Are you 18?(y/N)");
		Scanner scanner = new Scanner(System.in);
		String line = scanner.nextLine();
		boolean adult = line.toUpperCase().equals("Y");
		System.out.println(adult);
		if (adult) {
			System.out.println("Your age?");
			int age = scanner.nextInt();
			System.out.println("Your name?");
			Scanner scanner2 = new Scanner(System.in);
			String name = scanner2.nextLine();
			System.out.println(name);
			System.out.println("Your nickname?");
			Scanner scanner3 = new Scanner(System.in);
			String nickName = scanner3.nextLine();	
			System.out.print(age+"/"+name+"/"+nickName);
			
		
		} else {
			System.out.println("Thanks for supporting us, bye!");
		}
		
		
	}

}
