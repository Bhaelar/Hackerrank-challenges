
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
        int[] a = {12, 15, 7, 8, 19, 24};
        System.out.println(toys(a));
    }
    
    static int toys(int[] w) {
        int result = 1;
        
        Arrays.sort(w);
        int min = w[0];
        for(int i = 0 ; i < w.length ; i++) {
            if(w[i] > min + 4) {
                min = w[i];
                result++;
            }
        }
        return result;
    }
}
