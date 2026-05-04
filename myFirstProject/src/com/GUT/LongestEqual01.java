package com.GUT;

import java.util.*;

public class LongestEqual01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter array size: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter elements for array: ");
        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        int sum = 0;
        int maxLength = 0;
        
        // Important: sum 0 at index -1
        map.put(0, -1);
        System.out.println(map);
        
        for(int i = 0; i < n; i++) {
            
            // Convert 0 to -1
            if(arr[i] == 0)
                sum += -1;
            else
                sum += 1;
            
            if(map.containsKey(sum)) {
                int length = i - map.get(sum);
                maxLength = Math.max(maxLength, length);
            } else {
                map.put(sum, i);  // store first occurrence
            }
        }  
        System.out.println(maxLength); 
        sc.close();
    }
}