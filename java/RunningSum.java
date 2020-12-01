import java.util.Arrays;

public class RunningSum {

    public static int[] runningSum(int[] nums) {

        int temp[] = new int[nums.length];

        int sum = 0;

        for (int i = 0; i < nums.length; i++){
            sum = sum+nums[i];
            temp[i] = sum;
        }

        return temp;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,4};
        int[] b = {1,2,1,3,5,6,4};
        int[] c = {1,1,1,1,1};
        int[] d = {};
        System.out.println(Arrays.toString(runningSum(c)));
    }
}
