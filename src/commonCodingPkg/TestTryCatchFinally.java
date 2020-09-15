package commonCodingPkg;

public class TestTryCatchFinally {
	
	public int callTest() {
		try {
			System.out.println("I am in TRY");
			throw new ArithmeticException("test");
			//return 1;
		}catch (ArithmeticException ex){
			System.out.println(ex);
			System.out.println("I am in CATCH");
			return 2;
		}finally {
			System.out.println("I am in FINALLY");
			
		}
		
	}
	public static void main(String args[]) {
		TestTryCatchFinally t= new TestTryCatchFinally();
		System.out.println(t.callTest());
		
	}
}
