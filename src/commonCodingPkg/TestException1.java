package commonCodingPkg;

public class TestException1 {

	
	public static void main(String[] args){
		
		System.out.println(callMethod());
	}
	public static int callMethod(){
		int result=7;
		try{
			result =19/0;
			System.out.println("try");
			return result;
		}
		catch(ArithmeticException e ){
			System.out.println("catch");
		
			return -1;

		}finally{
			//result=90;
			System.out.println("finally");		
			//return result;

		}
	//	return result;
	}
}
