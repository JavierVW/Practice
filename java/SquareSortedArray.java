/*Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
* Input: nums = [-4,-1,0,3,10]
* Output: [0,1,9,16,100]
* Explanation: After squaring, the array becomes [16,1,0,9,100].
* After sorting, it becomes [0,1,9,16,100].*/

import java.util.Arrays;

public class SquareSortedArray {

    public static int[] squareArr(int[] nums) {

        int square;

        int[] finalArr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {

            square = nums[i] * nums[i];
            finalArr[i]=square;

        }
        Arrays.sort(finalArr);
        return finalArr;
    }

    public static void main(String[] args) {
        int[] a = {1,1,2,3,1,1,1};
        int[] b = {1,2,1,3,5,6,4};
        int[] c = {555,901,482,1771, 22, 3234};
        int[] d = {2,12};
        System.out.println(Arrays.toString(squareArr(a)));
    }
}
