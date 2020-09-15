package commonCodingPkg;

public class PrintPositiveNegetive {
	public static void rearrange(int[] arr) {
		int temp, j = -1;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < 0) {
				j++;
				if (arr[i] != arr[j]) {
					temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
		System.out.println("\nnew arr::");
		for (int e : arr) {
			System.out.print(e + " ");
			StringBuffer sbf=new StringBuffer("Prajita");
			sbf.append(" Sinha");
			sbf.replace(0,5,"Ani");
			System.out.println(sbf);
		}
	}

	public static void main(String args[]) {
		int[] arr = { -4, -6, -22, 4, 7, -3, 56, 8, 9, -14 };
		System.out.println("old arr::");
		for (int e : arr) {
			System.out.print(e + " ");
		}
		rearrange(arr);
	}

}
