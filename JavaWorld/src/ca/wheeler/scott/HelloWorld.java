package ca.wheeler.scott;

import java.lang.ArrayIndexOutOfBoundsException;

public class HelloWorld {

	public static void main(String[] args) {
		String helloString = "hello world";
		try {
			System.out.println("hello, " + args[0]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(helloString);
		}
		
	}

}
