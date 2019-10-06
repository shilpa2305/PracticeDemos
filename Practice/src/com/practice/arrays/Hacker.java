package com.practice.arrays;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Hacker {

	public static void main(String[] args) {
		int n=22;
		int coupons[] = new int[n];
		for(int i=1;i<=n;i++){
			coupons[i-1]=i;
		}
		
		int couponSums[]=new int[n];
		int sum=0,q=0,r=0;
		for(int i=0;i<n;i++){
			if(coupons[i]>=10){
				while(coupons[i]>0){
					r=coupons[i]%10;
					sum = sum+r;
					coupons[i] = coupons[i]/10;
				}
				couponSums[i] = sum;
				sum=0;
			}
			else if(coupons[i]<=9) 
			couponSums[i]=coupons[i];
		}
		
		for(int i=0;i<couponSums.length;i++){
			System.out.print(couponSums[i]+ " ");
		}
        
        
		System.out.println();
		
		HashMap<Integer, Integer> map = new HashMap<>();
		for(Integer i : couponSums){
			if(map.containsKey(i))
			{
				int value = map.get(i)+1;
				map.put(i, value);
			}	
			else map.put(i, 1);
		}
		
		//Iterate through map
		//1. using for-loop
		Set<Map.Entry<Integer, Integer>> entries=  map.entrySet();
		for(Map.Entry<Integer, Integer> entry : entries){
			//System.out.println(entry.getKey()+ " "+entry.getValue());
		}

		
		int count=0;
		Set<Integer> uniqueValues = new HashSet<Integer>(map.values());
		//Iterator<Integer> itr = uniqueValues.iterator();
		if(uniqueValues.size()==1){
			for(Integer i:map.keySet())
			{
				count++;
			}
			System.out.println(count);
		}
		else  System.out.println(Collections.max(map.values()));
		
	}

}
