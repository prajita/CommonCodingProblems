package commonCodingPkg;

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {
        Scanner sc= new Scanner(System.in);
        String input1=sc.next();
        String input2=sc.next();
        List<Character> duplicate= new ArrayList<Character>();
        duplicate=findDuplicate(input1);
        char[] charList2= input2.toCharArray();
        for(int i=0;i<input2.length();i++)
        {
            for(Character c:duplicate){
                if(charList2[i]==c){
                    input2=input2.replace(c.toString(),"");
                }
            }

        }
        System.out.println(input2);
               

   }
   public static ArrayList<Character> findDuplicate(String Stringinput){
       List<Character> duplicate= new ArrayList<Character>();
       char[] charList= Stringinput.toCharArray();
       Map<Character,Integer> m= new HashMap<Character,Integer>();
        for(int i=0;i<Stringinput.length();i++){
            if(m.containsKey(charList[i])){
                duplicate.add(charList[i]);
            }
            m.put(charList[i],1);
        }
        return (ArrayList<Character>) duplicate;
}
}
