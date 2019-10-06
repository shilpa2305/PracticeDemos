package com.practice.arrays;

import java.util.Arrays;
import java.util.BitSet;

public class MissingNumber {

	public static void main(String[] args) {
		
		int[] iArray = new int[]{4, 1, 3, 5};
        int missing = getMissingNumber(iArray, 5);
        //System.out.printf("Missing number in array %s is %d %n", 
          //      Arrays.toString(iArray), missing);
        //2 missing elements
        printMissingNumber(new int[]{1, 2, 5, 6});

	}

	private static int getMissingNumber(int[] numbers, int size) {
		int expectedSum = (size*(size+1))/2;
		int actualSum = 0;
		for(int i:numbers){
			actualSum+=i;
		}
		
		return expectedSum-actualSum;
	}

	private static void printMissingNumber(int[] numbers) {
		int size = numbers.length +2;
		int totalSum = (size * (size+1))/2;
		int arrSum = 0;
		for(int i:numbers){
			arrSum+=i;
		}
		int pivot = (totalSum-arrSum)/2;
		System.out.println(pivot);
		
		int xor1=0,xor2=0, xor3=0, xor4=0;
		
		for(int i=1;i<=pivot;i++)	xor1^=i;
		for(int i=pivot+1;i<=size;i++)	xor2^=i;
		for(int i=0;i<=numbers.length && numbers[i]<=pivot;i++)	xor3^=numbers[i];
		for(int i=0;i<=numbers.length && numbers[i]>pivot;i++)	xor4^=numbers[i];
		System.out.println(xor1 + " " + xor2 + " "+ xor3 + " " + xor4);
		System.out.println((xor1 ^ xor3) + " "+ (xor2 ^xor4));
	}		
}
