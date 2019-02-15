package tumusiime.iuea;

import java.util.Scanner;

public class FASTWORK {

	public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
      
        int score;
        String regno;
        int j=100;
        int p=6;
        
        for(int i=0;i<j;i++) {
        	System.out.println("Enter your Name: ");
        	regno=scn.next();
        	
        	for(int k=0;k<p;k++) {
        	System.out.print("Enter your Mark: ");
        	score=scn.nextInt();
        	
        	if(score >=80 && score <=100) {
        		System.out.println(" Grade is A and GPA=5.0");
        	}
        	else if(score>=75 && score<=79) {
        		System.out.println("Grade is B+ and GPA=4.5");
        	}
        	else if(score>=70 && score<=74) {
        		System.out.println("Grade is B and GPA=4.0");
        	}
        	else if(score>=65 && score<=69) {
        		System.out.println("Grade is C+ and GPA=3.5");
        	}
        	else if(score>=60 && score<=64) {
        		System.out.println("Grade is C and GPA=3.0");
        	}
        	else if(score>=55 && score<=59) {
        		System.out.println("Grade is D+ and GPA=2.5");
        	}
        	else if(score>=50 && score<=54) {
        		System.out.println("Grade is D and GPA=2.0");
        	}
        	else {
        		System.out.println("Grade is F and GPA=0.0 ");
        	}
        	
          }
        	
        }
        
	  }
	
   }