package com.practice.arrays;

import java.util.Scanner;

public class Hacker2 {
	static int count = 0;
	static String[] strArray = new String[100];
	static int[] sumArray = new int[100];
		
	 public Hacker2(int numberOfOnes, int length) {
		    StringBuilder start = new StringBuilder();
		    for (int x = 0; x < length; x++)
		      start.append('0');
		    permutate(numberOfOnes, 0, 0, length, start);
		    System.out.println("Number of combos is " + count);
		    int[] decimal=new int[count];
		    int sum = 0;
		    for(int i=0;i<count;i++){
		      decimal[i] =  Integer.parseInt(strArray[i],2);
		    }
		    for(int i=0;i<count;i++){
			      sum += decimal[i] ;
			 }
		    System.out.println("Sum "+sum);
		    //System.exit(0);
		  }
	 
	
	public static void permutate(int numberOfOnes, int first, int depth, int length, StringBuilder base) {
		   
		    for (int x = first; x < length; x++) {
		      StringBuilder onesAndZeros = new StringBuilder(base.toString());
		      
		      onesAndZeros.setCharAt(x, '1');
		      if (numberOfOnes == depth + 1){
		      //  System.out.println(onesAndZeros.toString());
		        
		        strArray[count] = new String(onesAndZeros);
		        count++;
		      }
		      else
		        permutate(numberOfOnes, x + 1, depth + 1, length, onesAndZeros);
		    }
		 }
}
