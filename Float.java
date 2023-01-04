
	// five subject total marks

	package com.math.calculation.table;

import java.util.Scanner;

public class Float {
		
	public static void main(String[]args) {
		
		// create scanner object
		@SuppressWarnings("resource")
		Scanner scan =new Scanner(System.in); 
		
	       System.out.println("Enter the marks of 5 Subjets");
	       
	       // to store the valus of 5 subject
	       
	  float English = scan.nextFloat();
	   float Marathi= scan.nextFloat();
	    float Hindi = scan.nextFloat();
	    float History = scan.nextFloat();
	    float Maths	= scan.nextFloat();	
	       
	    // Declaration
	       float total;
	       float average;
	       float percentge;
	       char grade;
	       
	       // calculation Total, Average,Percentage, grade
	       
	       total = English + Hindi + History + Maths + Marathi;
	       average = (float)(total/5.0);
	       percentge = (float)(total/550.0)*100;
	       
	       // if else if ladder use with && operators
	       
	       if(percentge>=90)
	    	   grade='A';
	       else if (percentge>75 && percentge <90)
	    	   grade ='B';
	       else if (percentge >60 && percentge <75)
	           grade ='C';
	       else if (percentge >50 && percentge <60)
	    	   grade ='D';
	       else if (percentge >36 && percentge <55)
	    	   grade ='E';
	       else 
	    	  grade = 'f';
	       // it will produce final output 
	       
	       System.out.println("total marks out of 550 :" +total);
	       
	       System.out.println("average marks of 5 Subjects :" +average);
	       System.out.println("percentge :" + percentge);
	       System.out.println("Grade :" +grade);
	     
}
}