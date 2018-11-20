package com.yoyo;

public class Student {
String name;
	int math;
	int english;
	int chinese;
	int art;
	public void print(){
	System.out.println(name + "\t" + math + "\t" + english + "\t" + chinese + "\t" + art + "\t" + (math+english+chinese+art)/4);}
		
public Student(String name, int math, int english, int chinese, int art){
	this.name= name;
			this.math = math;
			this.english = english;
			this.chinese = chinese;
			this.art = art;
			}
public static void main(String[] args) {
	int getAverage = getAverage(); 
	System.out.print(getAverage() >= 90 && getAverage() <= 100);
	switch(average/10){
	case 10:
	case 9:
		grading = 'A';
		break;
	case 8 :
		garding = 'B';
		break;
	case 7 :
	garding = 'C';
	break; 
	
	}
}
public int getAverage(){
return(english+math)/2;
}
}
