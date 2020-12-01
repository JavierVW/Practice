/*Given a binary array, find the maximum number of consecutive 1s in this array.
*Example 1:
* Input: [1,1,0,1,1,1]
* Output: 3
* Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.
* */

public class ConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {

        int counter = 0;
        int maxOnes = 0;

        for(int i = 0; i < nums.length; i++){

            if (nums[i] == 1){
                counter++;
                if (counter > maxOnes){
                    maxOnes = counter;
                }
            }
            else{
                counter = 0;
            }


            //counter++;
        }
        return maxOnes;
    }

    public static void main(String[] args) {
        int[] a = {1,1,2,3,1,1,1};
        int[] b = {1,2,1,3,5,6,4};
        int[] c = {1,2};
        int[] d = {2,1};
        System.out.println(findMaxConsecutiveOnes(a));
    }
}
