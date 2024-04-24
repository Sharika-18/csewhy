/*
 Que3: Write a program to input an integer 'n' and print the sum of all its even digits and the sum of all its odd digits separately.
Digits mean numbers, not places! That is, if the given integer is "132456", even digits are 2, 4, and 6, and odd digits are 1, 3, and 5.
 */
import java.util.Scanner;
public class digitssum {
	
	public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int evensum=0;
            int oddsum=0;
            while(n>0){
               int rem = n%10;
               if(rem%2==0){
            	   evensum +=rem;
               }
               else{
            	   oddsum +=rem;
               }
               n /=10;
            }		
            System.out.print(evensum +"\t"+ oddsum);
        }
	
	}
}