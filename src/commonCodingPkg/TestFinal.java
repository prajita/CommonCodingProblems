package commonCodingPkg;
import org.apache.commons.lang3.ArrayUtils;
abstract class CheckAbs {
	public int checkMethod() {
		final int fi ;
//		{fi=8;}
		fi=10;
		return fi;
	};

	public abstract void checkAbsMethod();
}

class Check1 extends CheckAbs {
	public final static int p;
	// if final variable is not initated while defined, then it can only be assigned
	// value by initialized block
	static {
		p = 6;
		System.out.println("inside static block");
	}

	Check1() {
		System.out.println("inside constructor block");
		int[] arr=new int[] {7,8,4,0,3,9};
		int mid=(0+arr.length)/2;
		System.out.println(mid +"is ::"+arr[mid]);
				
	}

	@Override
	public void checkAbsMethod() {
		System.out.println("inside checkAbsMethod");
	}
}

 class Check2{
	Check2(){
		final int[] arr= {3,6,7,8};
		//arr=ArrayUtils.remove(arr,0);
		System.out.println("final array is::");
		for(int t:arr) {
			System.out.println(t*10);
		}
		System.out.println("end");
		
	}
}

public class TestFinal {

	public static void main(String[] args) {
		Check1 c = new Check1();
		Check2 c2=new Check2();
		System.out.println(c.checkMethod());
		System.out.println(c.p);
	}

}
