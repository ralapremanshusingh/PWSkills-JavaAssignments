package com.rala.arrayPractice;

public class AnotherClassMethodCallInMainMethod {
	
	public static void main(String args[]) {
		
		AnotherClass anotherClass = new AnotherClass();
		anotherClass.anotherClassMethod();
		
	}

}

class AnotherClass {
	public void anotherClassMethod() {
		System.out.println("Welcome in another class");
	}
}
