package commonCodingPkg;

import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
	public static void main(String args[]) {
		int[] candidates = new int[] { 5, 7, 8, 2, 3, 1, 6, 11 };
		List<List<Integer>> list = new ArrayList<List<Integer>>();
		list=combinationSum(candidates, 13);
		list.stream().forEach(e->System.out.println(e));
	}
	static List<List<Integer>> result = new ArrayList<>();
    public static List<List<Integer>> combinationSum(int[] candidates, int target) {
        if(candidates == null) return result;
        dfs(candidates, 0, 0, new ArrayList<Integer>(), target);
        return result;
    }
    private static  void dfs(int[] array, int index, int sum, List<Integer> combSum, int target){
        if(sum == target){
            result.add(new ArrayList<>(combSum));
            return;
        }
        if(sum > target) return;
        while(index < array.length){
            sum += array[index];
            List<Integer> comb = new ArrayList<>(combSum);
            comb.add(array[index]);
            dfs(array, index, sum, comb, target);
            int indexToRemove = comb.size()-1;            
            sum -= comb.get(indexToRemove);
            index++;
            comb.remove(indexToRemove);
        }
    }
}
