package commonCodingPkg;

import java.util.ArrayList;
import java.util.List;

public class CreateTargetArray {
	
	public static int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> target = new ArrayList<>();
        for (int i = 0; i < nums.length; ++i) {
            target.add(index[i], nums[i]);
       
        }

        return target.stream().mapToInt(x -> x).toArray();
        
        
    }
	public static void main(String args[]) {
		int[] nums =new int [] {0,1,2,3,4};
		int[] index =new int [] {0,1,2,2,1};
		int[] target = createTargetArray(nums, index);
		
		for(int i: target) {
			System.out.print(i+"  ");
		}
		System.out.println();
		List<Integer> target2 = new ArrayList<>();
		target2.add(0,  1);
		target2.add(1,  2);
		target2.add(0,  3);
		target2.add(2,  5);
		target2.add(3,  6);
		target2.add(4,  8);
		target2.add(5,  9);
		target2.add(6,  10);
		target2.add(7,  11);
		int count=0;
		for(int i: target2) {
			System.out.println("count:::"+count+"   "+i+"  ");
			count++;
		}
		
		
	}
}
