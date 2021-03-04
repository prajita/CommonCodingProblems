package commonCodingPkg;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class FrequencySort {
public static void main(String args[]) {
	
	int[] res=frequencySort(new int[] {-1,1,-6,4,5,-6,1,4,1});
	for(int e: res) {
		System.out.print(e+"   ");
	}
	
}

public static int[] frequencySort(int[] nums) {
    
    
    
	Map<Integer, Integer> map=new HashMap<Integer, Integer>();

    for(int i: nums){
        map.put(i, map.getOrDefault(i, 0)+1);
    }
    PriorityQueue<Integer> minHeap= new PriorityQueue<>((a, b)->{
        if(map.get(a)==map.get(b)){
            return b-a;
        }
        return map.get(a)-map.get(b);
        
        });

    minHeap.addAll(map.keySet());
    int start=0;
    while(minHeap.size()>0 ){
        int val=minHeap.remove();
        int count =map.get(val);
        while(count>0){
            nums[start++]=val;
            count--;
        }
    }
    return nums;
}
}
