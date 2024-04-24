/*
Problem statement
Check whether a given number ’n’ is a palindrome number.
Note :
Palindrome numbers are the numbers that don't change when reversed.
You don’t need to print anything. Just implement the given function.
Example:
Input: 'n' = 51415
Output: true
Explanation: On reversing, 51415 gives 51415. 
*/
public class palindrome {
        public static boolean palindromeNumber(int n){
            int r,sum=0,temp;    
            temp=n;    
            while(n>0){    
            r=n%10;    
            sum=(sum*10)+r;    
            n=n/10;    
            }    
            if(temp==sum)    
               return true;
            else    
               return false;
        }
}

