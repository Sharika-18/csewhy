/*
Que2: The n-th term of Fibonacci series F(n), where F(n) is a function, is calculated using the following formula -
    F(n) = F(n - 1) + F(n - 2), 
    Where, F(1) = 1, F(2) = 1
Provided 'n' you have to find out the n-th Fibonacci Number. Handle edges cases like when 'n' = 1 or 'n' = 2 by using conditionals like if else and return what's expected.
"Indexing is start from 1"
 */
import java.util.*;
public class Nth_fibonacci_number{

	static int fib(int n){
		if(n==1 || n==2){
			return 1;
		}
		return fib(n-1)+ fib(n-2);
	}
	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.println(fib(n));
        }
	}

}