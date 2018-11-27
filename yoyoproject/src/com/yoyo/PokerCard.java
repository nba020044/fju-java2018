package com.yoyo;

import java.util.Random;

public class PokerCard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("It's poker time");

	// TODO Auto-generated method stub
int[] flouwers ={0x2663, 0x2666, 0x2665, 0x2660};
int[] nums = new int[5];
nums[0] = 77;
nums[1]=80;
nums[2]=83;
nums[3]=86;
nums[4]=98;
char a = 0x2665;
char b = 0x2666;
char d = 0x2663;
char e = 0x2660;
System.out.println();
System.out.println(nums.length);
for (int i=0; i<nums.length; i++){
	System.out.println(nums[i]);
}
Random random = new Random();
int number = random.nextInt(13) + 1 ;
int flower = random.nextInt(4);
System.out.print(number);
char c = 0;
switch(flower){
case 0:
	c = 'C';
	break;
case 1:
	c = 'D';
	break;
case 2:
	c = 'H';
	break;
case 3:
	c = 'S';
	break;
}
System.out.print(c);

	}
	}


