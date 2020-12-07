import java.util.*;

/**A basic FizzBuzz program done with lists.
*
* FizzBuzz.
*
* Given numbers from 1 to n, print out the value of n.
* If n is divisible by 3, print Fizz.
* If n is divisible by 5, print Buzz.
* If n is divisible by both 3 and 5, print FizzBuzz.
* */

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> FizzList = new ArrayList<String>();

        for (int i = 1; i<=n; i++){
            if (i % 15==0){
                FizzList.add("FizzBuzz");
            }
            else if (i % 5==0){
                FizzList.add("Buzz");
            }
            else if (i % 3==0){
                FizzList.add("Fizz");
            }
            else{
                FizzList.add(String.valueOf(i));
            }
        }
        return FizzList;
    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(15).toString());

    }


}
