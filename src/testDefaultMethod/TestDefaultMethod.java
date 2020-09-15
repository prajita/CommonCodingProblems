package testDefaultMethod;

public class TestDefaultMethod {

	
	
	public interface A{
		default void defaultMethod() {System.out.println("Inside interface A");}
		
	}

	public interface B{
		default void defaultMethod() {System.out.println("Inside interface B");}

		
	}
	public static class Impl implements A, B{


		public void defaultMethod1() {
			System.out.println("Inside class Impl");
		}

		@Override
		public void defaultMethod() {
			// TODO Auto-generated method stub
			// you need to add which default method you want to add
			A.super.defaultMethod();
			System.out.println("Inside class Impl");
			
			
		}
		
	}
	public static void main(String args[]) {
		Impl i = new Impl();
		i.defaultMethod();

		
	}
}
