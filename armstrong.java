/*
Problem statement
You are given an integer 'n'.
Return 'true' if 'n' is an Armstrong number, and 'false' otherwise.
Note:
An Armstrong number is a number (with 'k' digits) such that the sum of its digits raised to 'kth' power is equal to the number itself. For example, 371 is an Armstrong number because 3^3 + 7^3 + 1^3 = 371.
*/
import java.util.*;
public class armstrong{
	
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int sum=0;
            int count=0;
            int temp =n;
            while(temp != 0){
            	count++;
            	temp /=10;
            }
            temp = n;
            int originalnumber = n;
            while(temp != 0){
              int digit = temp%10;
              sum += Math.pow(digit,count);
              temp /=10;
            }
            if(sum == originalnumber){
            	System.out.println("true");
            }else
               System.out.println("false");
        }

	}
}