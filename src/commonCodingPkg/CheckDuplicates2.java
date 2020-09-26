package commonCodingPkg;

import java.awt.List;
import java.util.HashMap;
import java.util.Map;

/*
 * Given an array of integers and an integer k, 
 * find out whether there are two distinct indices
 *  i and j in the array such that nums[i] = nums[j]
 *   and the absolute difference between i and j is at most k.
 * */
public class CheckDuplicates2 {

	public static void main(String args[]) {	
		int[] arr=new int[] {1,2,3,1};
		int distance = 3;
		System.out.println(checkduplicates2(arr, distance));	
		
		
		Dog d = new Dog();
		d.make();
		d.move();
		d.wag();
		d.fetch();
		
		Canine c = new Dog();
		c.make();
		c.move();
		c.wag();
		//c.fetch();
		
		Animal a = new Dog();
		a.make();
		a.move();
//		a.wag();
//		a.fetch();
//		
		
	}

	private static boolean checkduplicates2(int [] nums, int k) {
		if(nums.length==0) return false;
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;i++) {
			int current = nums[i];
			if(map.containsKey(current) && i-map.get(current)<=k)return true;
			else map.put(current, i);
		}
		
		/*int j=0;
		for(int i=1;i<nums.length;i++){
            
            for(int j=0;j<i; j++){
                if(nums[i]==nums[j] && i-j<=k){
                    return true;
                }
            }
        }*/
		
		
        return false;
		
	}
	public void addString(List list) {
		list.add("a");
	}
}

abstract class Animal{
	
	public abstract void make();
	public abstract void move();

	
}
abstract class Canine extends Animal{
	
	public  void wag() {
		System.out.println("wag");		

	}
	public  void move() {
		System.out.println("run");		

	};
		
}
class Dog extends Canine{
	
	public void make() {
		System.out.println("bark");		

	};
	public  void fetch() {
		System.out.println("fetch");		

	};

	
}


