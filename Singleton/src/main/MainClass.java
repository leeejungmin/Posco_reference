package main;

import java.util.Calendar;

import cls.MyClass;
import cls.YouClass;
import single.SingletonClass;

public class MainClass {

	public static void main(String[] args) {
		
		MyClass mycls = new MyClass();
		YouClass youcls = new YouClass();
		
		//youcls.setCount( mycls.getNumber() );
		
		mycls.method();
		youcls.func();
		
		System.out.println(youcls.toString());
		
		
	//	System.out.println( SingletonClass.getInstance() );
	//	System.out.println( SingletonClass.getInstance() );
	//	System.out.println( SingletonClass.getInstance() );
		
		
	}

}






