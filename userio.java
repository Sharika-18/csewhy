/*
Que1: Write a program that takes a character as input and prints 1, 0, or -1 according to the following rules.

1, if the character is an uppercase alphabet (A - Z).
0, if the character is a lowercase alphabet (a - z).
-1, if the character is not an alphabet.
*/

import java.util.*;
public class userio {    
    public static void main(String[] args) {
        try (
        Scanner sc = new Scanner(System.in)) {
            char a = sc.next().charAt(0);
            if(Character.isUpperCase(a)){
               System.out.println("1");
            }
            else if(Character.isLowerCase(a)){
                System.out.println("0");
            }
            else{
                System.out.println("-1");
            }
        }

    }
}
