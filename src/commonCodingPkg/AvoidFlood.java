package commonCodingPkg;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class AvoidFlood {
	
	public static void main(String args[]) {
		
		int[] res = avoidFlood(new int[] {1,0,2,3,0,1,2});
		int[] res2 = avoidFloodUtil(new int[] {1,0,2,3,0,1,2});
		
		for(int e: res) {
			System.out.print(e+"   ");
		}
		System.out.print("\nsecond approach...");
		for(int e: res2) {
			System.out.print(e+"   ");
		}
		
	}
	
	public static int[] avoidFloodUtil(int[] rains) {
	      int len = rains.length;
	        int[] res = new int[len];
	        TreeSet<Integer> dryDays = new TreeSet<>();
	        Map<Integer, Integer> fullLakes = new HashMap<>();
	        for(int i=0; i<len; i++){
	            if(rains[i]>0){
	                res[i] = -1;
	                if(fullLakes.containsKey(rains[i])){
	                    Integer dryDay = dryDays.higher(fullLakes.get(rains[i]));
	                    if(dryDay==null) 
	                        return new int[0];
	                    else{
	                        dryDays.remove(dryDay);
	                        res[dryDay] = rains[i];
	                    }
	                }
	                fullLakes.put(rains[i], i);
	            }else{
	                res[i] = 1;
	                dryDays.add(i);
	            }
	        }
	        return res;
	    }
	
	 public static  int[] avoidFlood(int[] rains) {
	        int len = rains.length, i=0, start=0;
	        int[] res = new int[len];
	        TreeSet<Integer> dryDays = new TreeSet<>();
	        Map<Integer, Integer> fullLakes = new HashMap<>();
	        
	        while(i<len){
	            
	            if(rains[i]==0){
	                dryDays.add(i);
	                res[i++]=1;
	            }else{
	                if(fullLakes.keySet().contains(rains[i])){
	                    if(dryDays.size()>0){
	                        boolean bool=false;
	                        int pos=-1;
	                        for(int dryDay: dryDays){
	                            if(dryDay>fullLakes.get(rains[i])){
	                                bool=true;
	                                pos=dryDay;
	                                break;
	                            }
	                        }
	                        if(bool){
	                            res[pos]=rains[i];
	                            dryDays.remove(pos);
	                        }else{
	                            return new int[0];
	                        }
	                       
	                    }else{
	                        return new int[0];
	                    }
	                    
	                }else{
	                    fullLakes.put(rains[i], i);
	                }
	                res[i++]=-1;
	            }
	        }
	        return res;
	   
        }
}
