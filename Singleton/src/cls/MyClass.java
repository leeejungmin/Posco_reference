package cls;

import single.SingletonClass;

public class MyClass {

	private int number;
	
	public MyClass() {
		number = 123;
	}
	
	public void method() {
		SingletonClass sc = SingletonClass.getInstance();
		sc.num = number;
	}
	/*
	public int getNumber() {
		return number;
	}
	*/
	
	
}
