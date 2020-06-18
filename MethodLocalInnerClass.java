package com.innerclasses;

public class MethodLocalInnerClass {
	public void m1()
	{
		int i = 10;
		class innerClass {
			public void m2()
			{
				System.out.println(i);
			}
		}
		
		//i = 30;
	}
	public static void main(String[] args) {

	}

}
