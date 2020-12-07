/**
 * Print even or odd numbers based on input value
 *
 * If n = 6, print the first 6 even numbers. if n = 7, print the first 7 odd numbers.
 */


public class EvenOddPattern {
    public static void printPattern(int num) {
        int i, print = 0;
        if (num%2==0){
            for (i=0; i<num; i++){
                System.out.println(print + " ");
                print+=2;
            }
        }
        else{
            print=1;
            for (i=0; i<num;i++){
                System.out.println(print + " ");
                print+=2;
            }
        }
    }

    public static void main(String[] args) {
        printPattern(6);
    }
}
