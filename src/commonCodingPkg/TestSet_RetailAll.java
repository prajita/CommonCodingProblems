package commonCodingPkg;

import java.util.HashSet;
import java.util.Set;

public class TestSet_RetailAll {
	public static void main(String[] argv) throws Exception
    {
        try {
  
            Set<Integer> arrset1 = new HashSet<Integer>();
  
            arrset1.add(1);
            arrset1.add(2);
            arrset1.add(3);
            arrset1.add(4);
            arrset1.add(5);
            arrset1.add(6);
            arrset1.add(7);
            arrset1.add(8);
            arrset1.add(9);
            arrset1.add(10);
            arrset1.add(11);
            arrset1.add(12);
            
  
            System.out.println("Set before retainAll() operation : "
                               + arrset1);
  
            Set<Integer> arrset2 = new HashSet<Integer>();
            arrset2.add(1);
            arrset2.add(2);
            arrset2.add(3);
            arrset2.add(13);
            arrset2.add(14);
            arrset2.add(15);
  
            System.out.println("Collection Elements to be retained : "
                               + arrset2);
  
            arrset1.retainAll(arrset2);
  
            System.out.println("Set after retainAll() operation : "
                               + arrset1);
        }
  
        catch (NullPointerException e) {
            System.out.println("Exception thrown : " + e);
        }
    }
}
