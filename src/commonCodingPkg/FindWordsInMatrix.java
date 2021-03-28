package commonCodingPkg;

import java.util.ArrayList;
import java.util.List;

public class FindWordsInMatrix {
	public static void main(String... args) {

		
		char[][] m = new char[][] {{'e', 'y', 'e'}, {'l', 'a', 's'}, {'e', 'p', 'k'}};
		String[] list= new String[]{"eye", "lap", "ask", "ant"};
		String word="asfdk";
		System.out.print(findWords(m, word));

		
	}

	private static boolean findWords(char[][] m, String word) {
		for(int i=0;i<m.length;i++) {
			
			for(int j=0;j<m[0].length;j++) {
				
				if(m[i][j]== word.charAt(0) && dfs(m, i, j, 0, word)) {
					return true;
				}
			}
		}
		return false;
	}

	private static boolean dfs(char[][] m, int i, int j, int count, String word) {

		if(count==word.length()) {
			return true;
		}
		
		if(i<0 || i>=m.length || j<0 || j>=m[0].length ||m[i][j]!=word.charAt(count)) {
			return false;
		}
		
		char  temp=m[i][j];
		m[i][j]=' ';
		Boolean flag= dfs(m, i+1, j, count+1, word)|| 
				dfs(m, i, j+1, count+1, word)|| 
				dfs(m, i-1, j, count+1, word)|| 
				dfs(m, i, j-1, count+1, word);
		
		m[i][j]=temp;
		return flag;
		
		
	}
}
