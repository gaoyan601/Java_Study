package com.study.clazz;

public class Child_1 extends Father {

	@Override
	public void method_1() throws IllegalArgumentException {
		// TODO Auto-generated method stub
		throw new IllegalArgumentException();
	}

	public static void main(String[] args) {
		Child_1 c1=new Child_1();
		try{
			c1.method_1();
		}catch(Exception e){
			System.out.println(e.toString());
		}
	}
}
