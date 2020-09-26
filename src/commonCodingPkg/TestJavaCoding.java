package commonCodingPkg;

class Forecast {

	public int temparature;
	public int pressure;
}

public class TestJavaCoding {

	public static void change(String weather) {
		weather = "sunny";

	}

	public static void changeArr(String[] rainy) {
		rainy[1] = "Sunday";
	}

	public static void changeObj(Forecast f) {
		f.temparature = 35;
	}

	public static void main(String args[]) {

		System.out.println("Hello");
		String w = "rainy";
		change(w);
		System.out.println(w);

		String[] rdays = new String[] { "Monday", "Friday" };
		changeArr(rdays);
		System.out.println(rdays[1]);

		Forecast f = new Forecast();

		f.pressure = 700;
		f.temparature = 20;
		changeObj(f);
		System.out.println(f.temparature);

	}
}
