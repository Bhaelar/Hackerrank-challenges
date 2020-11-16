package priyankaandtoys;

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
public class PriyankaAndToys {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] a = {4,2,3,5,1};
        int k = 1;
        System.out.println(largestPermutation(k, a));
    }

    static int[] largestPermutation(int k, int[] arr) {
        for (int i = 0; i < k; i++) {
            int[] result = arr;
            Arrays.sort(result);
            int min = result[i];
            int max = result[arr.length - i - 1];
            int temp = IntStream.range(0, arr.length)
                    .filter(j -> min == arr[j])
                    .findFirst() // first occurrence 
                    .orElse(-1);
            int temp1 = IntStream.range(0, arr.length)
                    .filter(j -> max == arr[j])
                    .findFirst() // first occurrence 
                    .orElse(-1);
            arr[temp] = max;
            arr[temp1] = min;
        }
        return arr;
    }
}
