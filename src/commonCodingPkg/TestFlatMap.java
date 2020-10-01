package commonCodingPkg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestFlatMap {
	int i = 1;

	public void method1() {
		System.out.println("inside method1");
	}

	public void method1(int val) {
		System.out.println("inside method1 print val" + val);
	}

	public static void main(String[] args) {
		System.out.println("main");
		TestFlatMap t = new TestExtend();
		t.method1();
		System.out.println(t.i);

		List<String> list1 = new ArrayList<String>();
		List<String> list2 = new ArrayList<String>();

		list1 = Arrays.asList("A1", "A2", "A3");
		list2 = Arrays.asList("B1", "B2", "B3");

		Map<String, List<String>> map = new HashMap<String, List<String>>();
		
		map.put("A", list1);
		map.put("B", list2);
		//flatmap on MAP
		map.values().stream().flatMap(l->l.stream()).collect(Collectors.toList()).forEach(e-> System.out.println(e));
		
		
	}

}

class TestExtend extends TestFlatMap {
	int i = 2;

	public void method1() {
		System.out.println("inside method:: extended" + this.i);
	}
}

