package commonCodingPkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QueensThatCanAttackTheKing {
	public static void main(String args[]) {
		
		int[][] queens=new int [][] {{0, 2}, {1, 1}, {1, 0}, {2,2}, {3, 3}};
		int[] king=new int[] {0, 0};
		List<List<Integer>> res= new ArrayList();
		
		callUtil(queens, king, res);
		for(List<Integer> l: res) {
			System.out.print(l.get(0)+"    ");
			System.out.print(l.get(1));
			System.out.println();
			
		}
	}

	private static void callUtil(int[][] queens, int[] king, List<List<Integer>> result) {
		boolean [][] seen= new boolean[8][8];
		for(int[] e: queens) {
			seen[e[0]][e[1]]=true;
		}
		
		
		int[] directions= {-1, 0, 1};
		
		for(int dx: directions) {
			
			for(int dy: directions) {
				
				if(dx==0 && dy==0) {
					continue;
				}
				
				int x=king[0];
				int y=king[1];
				
				while(x+dx>=0 && x+dx<8 && y+dy<8 && y+dy>=0) {
					x+=dx;
					y+=dy;
					
					if(seen[x][y]) {
						result.add(Arrays.asList(x, y));
						break;
					}
				}
				
			}
		}
		
	}
}
