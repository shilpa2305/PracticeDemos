package com.practice.arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo {

	public static void main(String[] args) {
		List<XYZ> list = new ArrayList<>();
		list.add(new XYZ(56, "Shilpa"));
		list.add(new XYZ(23, "Amrutha"));
		list.add(new XYZ(6, "Pallavi"));
		list.add(new XYZ(78, "Shweta"));

		Collections.sort(list);
		for(XYZ x:list){
			//System.out.println(x.getId()+" "+x.getName());
		}
		
		
		//Collections.sort(list, X );
		//System.out.println();
		
		int n=23;
		
		int sum=0,q=0,r=0;
		while(n>0){
			//q = n/10;
			r=n%10;
			sum = sum+r;
			n = n/10;
			
		}
		System.out.println(sum);
	}

}
