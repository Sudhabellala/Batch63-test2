package com.collectoionsframework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortWithEndNumInArrayList {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<>(Arrays.asList(23,45,12,26,74,38));
		System.out.println(l);
		
		int r=0;
		for(int i=0;i<l.size();i++) {
			int n=l.get(i);
			while(l.get(i)>0) {
				r=l.get(i)%10;
				n=l.get(i)/10;
				
			}
			
		}
	}

}
