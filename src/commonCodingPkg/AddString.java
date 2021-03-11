package commonCodingPkg;

public class AddString {
	public static void main(String args[]) {
		String res=addString("0", "0");
		
		System.out.print(res);
		
	}

	public static String addString(String num1, String num2) {
		
		int i=num1.length()-1, j=num2.length()-1;
        int carry=0, sum=0;
        StringBuilder sb=new StringBuilder();
        while(i>=0 && j>=0){
        	
            /*sum=Integer.parseInt(String.valueOf(num1.charAt(i)))+
                Integer.parseInt(String.valueOf(num2.charAt(j)))+carry;*/
        	
        	//without using Integer parsetInt the way is to substract '0'
        	sum=num1.charAt(i)-'0'+
                    num2.charAt(j)-'0'+carry;
            i--;
            j--;
            if(sum>9){
                carry=(int)sum/10;
                sb.insert(0, sum%10);
            }else {
                carry=0;
                sb.insert(0, sum);
            }
        }
        System.out.println(sb.toString());
        
        while(i>=0){
            sum=num1.charAt(i)-'0'+carry;
            i--;
            if(sum>9){
                carry=(int)sum/10;
                sb.insert(0, sum%10);
            }else {
                carry=0;
                sb.insert(0, sum);
            }
        }
        
        while(j>=0){
            sum=num2.charAt(j)-'0'+carry;
            j--;
            if(sum>9){
                carry=(int)sum/10;
                sb.insert(0, sum%10);
            }else{
                carry=0;
                sb.insert(0, sum);
            }
        }
        
        if(carry>0){
            sb.insert(0, carry);
        }
        return sb.toString();
        	       
	}
}
