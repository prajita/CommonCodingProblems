package commonCodingPkg;

import java.util.*;

class Person {
	protected String firstName;
	protected String lastName;
	protected int idNumber;
	
	// Constructor
	Person(String firstName, String lastName, int identification){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = identification;
	}
	
	// Print person data
	public void printPerson(){
		 System.out.println(
				"Name: " + lastName + ", " + firstName 
			+ 	"\nID: " + idNumber); 
	}
	 
}

class StudentGrade extends Person{
	private int[] testScores;
    private String firstName;
    private String lastName;
    private int identification;
    StudentGrade(String firstName, String lastName, int identification,int[] testScores){
        super(firstName,lastName,identification);
        this.testScores=testScores;
     }
   public char calculate(){
	   int sum= 0;
	   for(int i=0;i<testScores.length;i++) {
		   sum+=testScores[i];
	   }
        float avg =(float)(sum/(testScores.length));
        if(avg<40 )return 'T';
        else if(40<avg && avg <55) return 'D';
        else if(55<avg && avg<70) return 'P';
        else if(70<avg && avg<80) return 'A';
        else if(80<avg && avg<90) return 'E';
        else if(90<avg && avg<100) return 'O';
        return 'T';

   }
}

class Solution {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String firstName = scan.next();
		String lastName = scan.next();
		int id = scan.nextInt();
		int numScores = scan.nextInt();
		int[] testScores = new int[numScores];
		for(int i = 0; i < numScores; i++){
			testScores[i] = scan.nextInt();
		}
		scan.close();
		
		StudentGrade s = new StudentGrade(firstName, lastName, id, testScores);
		s.printPerson();
		System.out.println("Grade: " + s.calculate() );
	}
}