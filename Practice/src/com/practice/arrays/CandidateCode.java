package com.practice.arrays;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

import org.omg.Messaging.SyncScopeHelper;

public class CandidateCode {

	public static void main(String args[] ) throws Exception {
		
		/*Scanner sc =new Scanner(System.in);
		System.out.println("Enter value for n: ");
		int n = sc.nextInt();
		
		int[] input = new int[n];
		System.out.println("Enter value for rolls: ");
		for(int i=0; i<n; i++ ) {
			input[i] = sc.nextInt();
		}*/
		//int[] input  = new int[]{1, 2, 3 ,7, 4 ,6, 5};
		
		
		int n = Integer.parseInt(args[0]);
		int[] input = new int[n];
		for(int i =1,j=0;i<args.length && j<n;i++,j++){
			input[j] = Integer.parseInt(args[i]);
		}
		
	
		/*TreeMap<Integer, Integer> map = new TreeMap<>();
		
		for(Integer i : list){
			if(map.containsKey(i)){
				Integer value = map.get(i);
				map.put(i, ++value);
			}
			else	map.put(i, 1);
		}

		Set<Map.Entry<Integer, Integer>> entrySet = map.entrySet();
		
		/*for(Map.Entry<Integer, Integer> entry:entrySet){
			System.out.println(entry.getKey()+" "+entry.getValue());
		}*/
		
		/*int noOfMissing = n - map.size();
		if(noOfMissing>0){
			for(Map.Entry<Integer, Integer> entry:entrySet){
				//System.out.println(entry.getKey()+" "+entry.getValue());
				
			}
		}*/
		
		/*TreeSet<Integer> set = new TreeSet<>();
		for(Integer i : list){
			set.add(i);
		}
		
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		int noOfMissing = n - set.size();
		//System.out.println(noOfMissing);
		for(int i=1;i<=list.length;i++){
			if(set.contains(i)){
				continue;
			}
			
		}*/
		
		HashSet<Integer> hs = new HashSet<>(); 
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < input.length; i++) 
            hs.add(input[i]); 
		for (int i = 1; i <= n; i++)  
        { 
            if (!hs.contains(i))  
            { 
                //System.out.print(i + " "); 
            	sb.append(i).append(' ');
            	
            } 
        } 
		//System.out.println(sb);
		System.out.println(sb.toString().trim());
		System.out.println();
		//System.out.print("o\b\n");
	}

}
