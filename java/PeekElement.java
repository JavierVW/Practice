public class PeekElement {

    public static int findPeakElement(int[] nums) {

        int elementIndex = 0;
        for (int i = 0; i < nums.length-1; i++){
            if (nums[i] > nums[i+1]){
                elementIndex = i;
                return elementIndex;
            }
        }

        return nums.length-1;
    }

    public static void main(String[] args) {
        int[] a = {1,2,3,1};
        int[] b = {1,2,1,3,5,6,4};
        int[] c = {1,2};
        int[] d = {2,1};
        System.out.println(findPeakElement(d));
    }
}
