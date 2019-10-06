package com.practice.arrays;

public class FindBinary {

	public static void main(String[] args) {
		int n= 6;
		int arr[] = new int[]{1,7,9,21,31,32};
		
		int a,num = 0;
		for(int i = 0 ; i<n; i++){
			int countOfOnes=0;
			num = arr[i];
			String x = "";
			while(num>0){
				a=num%2;
				x=a+x;
				num=num/2;
			}
			 System.out.println("Binary of "+arr[i]+" is "+x);
			 for(int j = 0;j<x.length();j++){
				 char ch = x.charAt(j);
				 if(ch=='1')
					 countOfOnes++;
			 }
			 System.out.println(countOfOnes);
		}
		}
		
		
			
	}

