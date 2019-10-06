package com.practice.arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MainProg {
	//static int count = 0;
	//static String[] strArray = new String[100];
	static HashMap<Integer, ArrayList<String>> map= new HashMap<>();
	static int[] sumArray = new int[100];
	
	public static void main(String[] args) {
		int n= 6;
		int arr[] = new int[]{1,7,9,21,31,32};
		int a,num = 0;
		for(int i = 0 ; i<n; i++){
			num = arr[i];
			String x = "";
			int countOfOnes=0;
			while(num>0){
				a=num%2;
				x=a+x;
				num=num/2;
			}
			// System.out.println("Binary of "+arr[i]+" is "+x);
			 for(int j = 0;j<x.length();j++){
				 char ch = x.charAt(j);
				 if(ch=='1')
					 countOfOnes++;
			 }
			// System.out.println("For --------------"+arr[i]);
			 map.put(arr[i], new ArrayList<>());
			 findCombos(arr[i],countOfOnes,x.length());	 
		}
		System.out.println(map.size());
		System.out.println("---------------------");
		int countEntry = 0;
		Set<Map.Entry<Integer, ArrayList<String>>> entries=  map.entrySet();
		for(Map.Entry<Integer, ArrayList<String>> entry : entries){
			//System.out.println(entry.getKey()+ " "+entry.getValue()+" Values ");
			Iterator<String> itr = entry.getValue().iterator();
			while(itr.hasNext()){
				//System.out.print(itr.next()+" ");
				String str = itr.next();
				countEntry++;
			}
			
			
			Iterator<String> itr2 = entry.getValue().iterator();
			
			int sum = 0;
			//System.out.println("kdfdsfkjdf");
				//System.out.println(itr2.next());
			for(int z=0;z<countEntry;z++){
				while(itr2.hasNext()){
					String str = itr2.next();
					sum +=  Integer.parseInt(str,2);
				}
			}
			System.out.println("Sum of each number is "+sum);
			countEntry=0;
		}		
			
	}
		
			
			
	
	public static void findCombos(int num,int numberOfOnes, int length) {
		StringBuilder start = new StringBuilder();
	    for (int x = 0; x < length; x++)
	      start.append('0');
	    permutate(num,numberOfOnes, 0, 0, length, start);
	}
	
	public static void permutate(int num,int numberOfOnes, int first, int depth, int length, StringBuilder base) {
		 for (int x = first; x < length; x++) {
	      StringBuilder onesAndZeros = new StringBuilder(base.toString());
	      
	      onesAndZeros.setCharAt(x, '1');
	      if (numberOfOnes == depth + 1){
	    	 // System.out.println(onesAndZeros.toString());
	    	  map.get(num).add(onesAndZeros.toString());
	      }
	      else
	        permutate(num,numberOfOnes, x + 1, depth + 1, length, onesAndZeros);
	    }
	 }
}
