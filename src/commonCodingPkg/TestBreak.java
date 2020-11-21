package commonCodingPkg;

public class TestBreak {
	public static void main(String[] args) {

		for (int i = 1; i <= 10; ++i) {
			for (int j = 1; j <= 10; ++j) {

				if (j == 5) 
					break;
				
				System.out.print(j+"    ");
			}
			System.out.println();
			System.out.print(i+"    "+"\n");
		}
	}
}
