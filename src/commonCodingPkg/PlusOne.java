package commonCodingPkg;

public class PlusOne {
public static void main(String args[]) {
	int[] res=plusOne(new int[] {9,8,7,6,5,4,3,2,1,0});

	for(int i:res) {
		System.out.print(i);
	}
}

public static int[] plusOne(int[] digits) {

	int len = digits.length - 1;
	boolean carry = false;
	while (len >= 0) {
		if (digits[len] == 9) {
			digits[len]=0;
			carry = true;
		} else {
			carry = false;
			digits[len]++;
			break;
		}
		len--;
	}
	if(carry) {
		int[] newArr= new int[digits.length+1];
		newArr[0]=1;
		len=1;
		while(len<digits.length) {
			newArr[len]=digits[len-1];
			len++;
			
		}
		return newArr;
	}
	return digits;
}
}
