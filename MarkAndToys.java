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
public class MarkAndToys {

    static int maximumToys(int[] prices, int k) {
        int result = 0;
        int sum = 0;
        Arrays.sort(prices);
        for(int i = 0 ; i < prices.length ; i++) {
            sum += prices[i];
            if(sum < k) {
                result++;
            } else {
                break;
            }
        }
        return result;

    }
}
