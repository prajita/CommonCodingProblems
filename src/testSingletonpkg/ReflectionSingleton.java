package testSingletonpkg;

import java.lang.reflect.Constructor;

//breaking using Relection

/*
 * There are many ways to prevent Singleton pattern
 *  from Reflection API, but one of the best solutions
 *   is to throw a run-time exception in the constructor
 *    if the instance already exists. 
 * 
 */
public class ReflectionSingleton {
	public static void main(String[] args) {

		Singleton obj1 = Singleton.getInstance();

		Singleton obj2 = null;

		try {
			Constructor constructor = Singleton.class.getDeclaredConstructor();
			constructor.setAccessible(true);
			obj2 = (Singleton) constructor.newInstance();

		} catch (Exception ex) {
			System.out.println(ex);
		}
		System.out.println(obj1.hashCode());
		System.out.println(obj2.hashCode());
	}
}
