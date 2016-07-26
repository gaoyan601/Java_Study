package com.study.clazz;

public class InheritInnerClass {
	String name;
	int age;
	
	
	public InheritInnerClass(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	class InnerClass1{
		
	}
	
}
class InnerClass2 extends InheritInnerClass.InnerClass1{
	
	public InnerClass2(InheritInnerClass iic) {
		// TODO Auto-generated constructor stub
		iic.super();
	}
	
}
