package commonCodingPkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

abstract class TextInput {
}

class NumericInput extends TextInput {
	StringBuilder sb = new StringBuilder();

	NumericInput() {
		this.sb.append("");
	}

	NumericInput(String str) {

		for (char ch : str.toLowerCase().toCharArray()) {
			if (Character.isDigit(ch)) {
				this.sb.append(ch);
			}
		}
	}
}

public class MergeArraysRemoveDuplicates {

	public static String[] uniqueNames(String[] names1, String[] names2) {

		List<String> list1 = new ArrayList<String>(Arrays.asList(names1));
		list1.addAll(new ArrayList<String>(Arrays.asList(names2)));
		Stream<String> stream = list1.stream();

		Set<String> streamSet = stream.collect(Collectors.toSet());
		String[] array = streamSet.toArray(new String[0]);

		// String[] array = streamSet.stream().toArray(String[]::new);
		/*
		 * String[] array = new String[streamSet.size()]; int index=0; for(String str:
		 * streamSet) { array[index++]=str; }
		 */

		// another way

		// String[] array = stream.distinct().collect(Collectors.toList()).toArray(new
		// String[0]);
		return array;
	}

	public static String getNumeric(String str) {
		StringBuilder sb = new StringBuilder();

		for (char ch : str.toLowerCase().toCharArray()) {
			if (Character.isDigit(ch)) {
				sb.append(ch);
			}
		}
		return sb.toString();
	}

	public static void main(String... args) {

		String[] names1 = new String[] { "Ava", "Emma", "Olivia" };
		String[] names2 = new String[] { "Olivia", "Sophia", "Emma" };
		System.out.println(String.join(", ", MergeArraysRemoveDuplicates.uniqueNames(names1, names2)));

		StringBuilder input = new StringBuilder();
		input.append('1');
		input.append('a');
		input.append('0');
		System.out.println(getNumeric(input.toString()));
	}
}
