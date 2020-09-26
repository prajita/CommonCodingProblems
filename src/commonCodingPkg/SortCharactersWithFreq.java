package commonCodingPkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class SortCharactersWithFreq {

	public static void main(String[] args) {
		
		String input = "Geeksforgeeks".toLowerCase();
				
		List<Character> list = new ArrayList<Character>();
		for(char i :input.toCharArray()) {
			list.add(i);
		}
		list.stream().sorted().forEach(System.out::print);

	}
}
