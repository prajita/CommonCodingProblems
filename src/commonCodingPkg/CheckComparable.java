package commonCodingPkg;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student implements Comparable {
	int roll;

	public int getRoll() {
		return roll;
	}

	public void setRoll(int roll) {
		this.roll = roll;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	String name;

	Student(int roll, String n) {
		this.roll = roll;
		this.name = n;
	}

	@Override
	public String toString() {
		return ("student:::" + this.name + "  " + this.roll);
	}

	@Override
	public int compareTo(Object obj) {
		Student s = (Student) obj;
		if (this.roll == s.roll) {
			return 0;
		} else if (this.roll > s.roll) {
			return 1;
		} else {
			return -1;
		}
	}

}

public class CheckComparable {
	public static void main(String args[]) {
		List<String> arr = new ArrayList<String>();
		arr.add("Apple");
		arr.add("Prajita");
		arr.add("Banana");
		arr.add("Guava");
		arr.add("Zoo");

		Collections.sort(arr);
		System.out.println("sorted::");
		arr.forEach(e -> System.out.print(e));

		Student s1 = new Student(2, "Prajita");
		Student s2 = new Student(7, "Mita");
		Student s3 = new Student(1, "Aparna");
		Student s4 = new Student(5, "Ziva");

		List<Student> ls = new ArrayList<Student>();
		ls.add(s1);
		ls.add(s2);
		ls.add(s3);
		ls.add(s4);
//		Collections.sort(ls,(a,b)->(a.getName().compareTo(b.getName())));
		System.out.println("sorted Students");
		Collections.sort(ls);
		for (Student s : ls) {
			System.out.println(s.toString());
		}
		System.out.println("Ärray sort check");
		int[] arrayInt = { 54, 6, 7, 23, 9, 11, 7 };
		Arrays.sort(arrayInt, 1, 5);
		System.out.println("arrayInt:");
		for (int e : arrayInt) {
			System.out.println(e);
		}

	}
}
