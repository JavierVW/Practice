
import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;


/**
 * Given an array of integers, find the sum of its elements.
 * For example, if the array ar=[1,2,3], 1+2+3=6, so return 6.
 */

public class SimpleArraySum {


    static int simpleArraySum(int[] ar) {

        int sum = 0;

        for (int i = 0; i < ar.length; i++){
            sum = sum + ar[i];

        }
        return sum;

    }
    public static void main(String[] args) {
        int[] a = {1,2,3,1};
        int[] b = {1,2,1,3,5,6,4};
        int[] c = {1,2};
        int[] d = {2,1};
        System.out.println(simpleArraySum(b));
    }

}
