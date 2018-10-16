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

}
