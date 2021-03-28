package commonCodingPkg;

import java.util.ArrayList;
import java.util.List;

public class FactorCombinations {
	public static void main(String... args) {

		int input = 36;
		List<List<Integer>> res = new ArrayList<>();
		List<Integer> list = new ArrayList<Integer>();
		findCombinations(input, 1, 2, list, res);

		for (List<Integer> i : res) {

			if (i.size() == 2) {
				System.out.print("[");
				i.stream().forEach(e -> System.out.print(e + "  "));
				System.out.print("]");
				System.out.println();
			}

		}
	}

	private static void findCombinations(int n, int product, int index, List<Integer> temp, List<List<Integer>> res) {

		if (product == n) {
			res.add(new ArrayList<>(temp));
			return;
		}
		if (product > n) {
			return;
		}

		for (int i = index; i <= (n / product); i++) {
			if (n % i == 0 && i != n) {
				temp.add(i);
				findCombinations(n, product * i, i, temp, res);
				temp.remove(temp.size() - 1);
			}
		}

		return;
	}

}
