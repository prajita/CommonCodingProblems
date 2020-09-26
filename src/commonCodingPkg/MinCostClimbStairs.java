package commonCodingPkg;

public class MinCostClimbStairs {
	public static void main(String[] args) {
		int[] cost = new int[] {10, 15, 20};
		System.out.println("min cost to reach top:::"+findMinCost(cost));
	}

	private static int findMinCost(int[] cost) {
		int length=cost.length;
		int[] res = new int[length];
		
		res[0]=cost[0];
		res[1]=cost[1];
		
		for(int i=2;i<length;i++) {
			res[i]=Math.min(res[i-1]+cost[i],res[i-2]+cost[i] );
		}
		
		return Math.min(res[length-1], res[length-2]);
	}
	
}
