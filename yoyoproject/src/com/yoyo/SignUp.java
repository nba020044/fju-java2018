package com.yoyo;

import java.util.Scanner;

public class SignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println("Are you 18?(y/N)");
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
			System.out.println("Thanks for supporting us, bye!"); */
	String s = "Hello world";
	//          01234567890
	String s2 ="Jack Tom Eric";
	//			0123456789012
	System.out.println();
	System.out.println(s2.lastIndexOf("c"));
	//S2字串內ㄉTOM"都"改成BOSS，所以裡面有兩個tomㄉ話就要全部都改成boss
	//Jack boss Eric
	String name ="Tom";
	//name = name.replace("Tom", "boss");
	System.out.println(s2.substring(0, 5) + name + s2.substring(8, 13));
	int index = s2.indexOf(name);
	System.out.println(s2.substring(0, index) + "boss" +
			s2.substring(index+name.length()));
	//(s2.substring(0, 4)) ,name,s2.substring(8 , 12)
	//System.out.println(s == s2);
	//System.out.println(s.equals(s2));
	System.out.println(s.substring(4)); 
	System.out.println(s.substring(2 , 6));
	int length = s.length();
	char last = s.charAt(length - 1);
	String r = "";
	for (int i = s.length() - 1; i >= 0; i--) {
		System.out.print(s.charAt(i));

		}

		}
	
		
	}



