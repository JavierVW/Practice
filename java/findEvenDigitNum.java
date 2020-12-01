/*Given an array nums of integers, return how many of them contain an even number of digits.
* Input: nums = [12,345,2,6,7896]
* Output: 2
* Explanation:
* 12 contains 2 digits (even number of digits).
* 345 contains 3 digits (odd number of digits).
* 2 contains 1 digit (odd number of digits).
* 6 contains 1 digit (odd number of digits).
* 7896 contains 4 digits (even number of digits).
* Therefore only 12 and 7896 contain an even number of digits.*/

public class findEvenDigitNum {

    public static int findEven(int[] nums) {

        int counter = 0;
        int length = 0;

        for (int num : nums) {

            length = (int) (Math.log10(num) + 1);
            if (length % 2 == 0) {
                counter++;
            }

        }
        return counter;
    }

    public static void main(String[] args) {
        int[] a = {1,1,2,3,1,1,1};
        int[] b = {1,2,1,3,5,6,4};
        int[] c = {555,901,482,1771, 22, 3234};
        int[] d = {2,12};
        System.out.println(findEven(c));
    }
}
