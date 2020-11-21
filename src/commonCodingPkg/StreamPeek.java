package commonCodingPkg;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamPeek {
	public static void main(String[] args) {
		Stream<String> nameStream = Stream.of("Alice", "Bob", "Chuck");
//		nameStream.peek(e->System.out.print(e.toUpperCase()+"   "+"PEEK SYSOUT  "))
//		.peek(e->System.out.print(e+"   "+"PEEK "))
//		.forEach(e->System.out.println(e+"   "+"FE "));

		nameStream.peek(e -> e.toUpperCase()).peek(e -> System.out.print(e + "   " + "PEEK "))
				.forEach(e -> System.out.println(e + "   " + "FE "));

		System.out.println("\n\n use of peek");
		Stream.of("one", "two", "three", "four").filter(e -> e.length() > 3)
				.peek(e -> System.out.println("Filtered value: " + e)).map(String::toUpperCase)
				.peek(e -> System.out.println("Mapped value: " + e)).collect(Collectors.toList());
		System.out.println("\n\n use of array based streams");
		String[] colors = { "Red", "Blue", "Green" };
		Arrays.stream(colors).map(String::toUpperCase).forEach(e -> System.out.print(e + "   "));

		List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5);
		Integer sum = integers.stream().mapToInt(e -> e).sum();
		System.out.println("\n\nsum::" + sum + "\n\n");

		int[] arr = new int[] { 3, 6, 8, 1 };
		System.out.println(Arrays.stream(arr).sum());
		
		System.out.println("use of intstream.."+IntStream.of(7, 1, 6).sum());
		

	}
}
