package commonCodingPkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllAnagram_in_a_String {

	public static void main(String args[]) {
		List<Integer> list=findAnagrams("cbaebabacd", "abc");
		for(int s: list) {
			System.out.println(s);
		}
		
	}
	public static List<Integer> findAnagrams(String s, String p) {
        int[] arr=new int[26];
        List<Integer> list= new ArrayList<Integer>();
        Arrays.fill(arr, 0);
        int i=0;
        while(i<p.length()){
            arr[p.charAt(i)-'a']=arr[p.charAt(i)-'a']==0 ? 1:arr[p.charAt(i)-'a']+1;
            i++;
        }
        for(i=0;i<s.length()-p.length()+1;i++){
            
            int j=0;
            int[] temp=Arrays.copyOf(arr, arr.length);
            while(j<p.length()){
                char c=s.charAt(i+j);
                temp[c-'a']=temp[c-'a']-1;
                j++;
            }
            int flag=1;
            for(int e:temp){
               if(e!=0){
                   flag=0;
               } 
            }
            if(flag==1) {
            	list.add(i);	
            }
        }
        return list;
    }
}
