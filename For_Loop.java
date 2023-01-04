//using for Loop


package com.math.calculation.table;

import java.util.Scanner;

public class For_Loop {

	public static void main(String[] args) {
		
		// create an Scanner s
	
		Scanner scan = new Scanner(System.in);
		scan.close();
		System.out.println("Enter a value to get math table");
        int table = scan.nextInt();
        
        // using switch case
        
        switch (table) {
        case 1:
        	System.out.println("Table 15");
        	int er =15;
        	
        	//using For Loop
        	for(int w=1;w<=35;w++)
        	{
        		System.out.println(er+ "*" +w+ "=" +er*w);
        	}
            break;
          
        
        case 2:
            System.out.println("Table of 9");
            int tr = 9;
            for (int q=1; q<=52; q++) {
      
			System.out.println(tr+ "*" +q+ "=" +tr*q);
        	 }
        break;
        
	      default :
		System.out.println("Invalid Number");
	}       
	
}
}

