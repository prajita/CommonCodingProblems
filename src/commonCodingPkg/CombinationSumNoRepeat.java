package commonCodingPkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//no duplicates in the result
public class CombinationSumNoRepeat {
	public static void main(String args[]) {
		int[] candidates = new int[] { 5, 7, 8, 2, 3, 1, 6, 11 };
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		Arrays.sort(candidates);
		list=combinationSum(candidates, 13);
		list.stream().forEach(e->System.out.println(e));
	}
	static List<List<Integer>> result = new ArrayList<>();
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates == null) return result;
        dfs(candidates, 0, target, new ArrayList<Integer>(), result);
        return result;
    }
    private static  void dfs(int[] array, int index, int target, List<Integer> current, List<List<Integer>> result){
        if(0 == target){
            result.add(new ArrayList<>(current));
            return;
        }
        if(target<0) return;
        for(int i=index;i < array.length;i++){
           if(i==index || array[i]!=array[i-1]) {
        	   current.add(array[i]);
        	   dfs(array, i+1, target-array[i], current ,result);
        	   current.remove(current.size()-1);
           }
        }
    }
}
