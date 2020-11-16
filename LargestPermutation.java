/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largestpermutation;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
import java.util.stream.IntStream;
/**
 *
 * @author Okenla
 */
public class LargestPermutation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = {4,2,3,5,1};
        int k = 1;
        System.out.println(Arrays.toString(largestPermutation(k, a)));
    }

    static int[] largestPermutation(int k, int[] arr) {
        /*
        for (int i = 0; i < k; i++) {
            int[] result = Arrays.copyOf(arr, arr.length);
            Arrays.sort(result);
            int max = result[arr.length - i - 1];
            int min = 0;
            for(int j = 0 ; j < arr.length ; j++) {
                if(arr[j] < max) {
                    min = arr[j];
                    break;
                }
            }
            final int min1 = min;
            int temp = IntStream.range(0, arr.length)
                    .filter(j -> min1 == arr[j])
                    .findFirst() // first occurrence 
                    .orElse(-1);
            int temp1 = IntStream.range(0, arr.length)
                    .filter(j -> max == arr[j])
                    .findFirst() // first occurrence 
                    .orElse(-1);
            if(temp > temp1) {
                continue;
            }
            arr[temp] = max;
            arr[temp1] = min;
        }
        */
        int pos[] = new int[arr.length + 1]; 
  
        for (int i = 0; i < arr.length; ++i) 
            pos[arr[i]] = i;
        
        // System.out.println(Arrays.toString(pos));
        for (int i = 0; i < arr.length && k > 0; ++i) { 
  
            // If element is already i'th 
            // largest, then no need to swap 
            if (arr[i] == arr.length - i) 
                continue; 
  
            // Find position of i'th largest 
            // value, n-i 
            int temp = pos[arr.length - i]; 
  
            // Swap the elements position 
            pos[arr[i]] = pos[arr.length - i]; 
            pos[arr.length - i] = i; 
  
            // Swap the ith largest value with the 
            // current value at ith place 
            int tmp1 = arr[temp]; 
            arr[temp] = arr[i]; 
            arr[i] = tmp1; 
  
            // decrement number of swaps 
            --k; 
        }
        return arr;
    }
    
}
