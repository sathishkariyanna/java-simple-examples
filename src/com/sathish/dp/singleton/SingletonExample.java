package com.sathish.dp.singleton;
/**
 * 
 * @author Sathish
 *
 */
public class SingletonExample {

	private static SingletonExample myObj;

	static {
		myObj = new SingletonExample();
	}

	private SingletonExample() {

	}

	public static SingletonExample getInstance() {
		return myObj;
	}

	public void testSigleton() {
		System.out.println("Calling Singleton....");
	}

	public static void main(String a[]) {
		SingletonExample ms = getInstance();
		ms.testSigleton();
	}
}
