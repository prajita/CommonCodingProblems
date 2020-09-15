package commonCodingPkg;

import java.util.List;
import java.util.Arrays;
import java.util.Vector;



public class TestVector {
	public static void main(String[] args) {

		Vector v= new Vector();
		v.add(4);
		List arr=Arrays.asList("ty","gh","te");
		v.addAll(0,arr);
		System.out.println("vector::"+v);
		
	}

}

