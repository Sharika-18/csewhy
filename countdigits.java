/*
You are given a number ’n’.
Find the number of digits of ‘n’ that evenly divide ‘n’.
Note:
A digit evenly divides ‘n’ if it leaves no remainder when dividing ‘n’.
Example:
Input: ‘n’ = 336
Output: 3
Explanation:
336 is divisible by both ‘3’ and ‘6’. Since ‘3’ occurs twice it is counted two times.
*/
import java.util.Scanner;
public class countdigits {
    public static int countDigits(int n){
       int count = 0;
       int originalnum = n;
       while(n != 0){
           int lastdigit = n%10;
           if(lastdigit !=0 && originalnum%lastdigit == 0){
               count++;
           }
         n /=10;
       }
       return count;
    }
    public static void main (String[] args) throws java.lang.Exception{
          try (Scanner sc = new Scanner (System.in)) {
            int n = sc.nextInt();
              System.out.println("Number of digits: " +countDigits(n));
        }
    }
}