/*
Aryan and his friends are very fond of patterns. For a given integer ‘N’, they want to make the Reverse Letter Triangle.
You must print a matrix corresponding to the given Reverse Letter Triangle.
Example:
Input: ‘N’ = 3
Output: 
A B C
A B
A
 */
public class pattern15 {
        public static void nLetterTriangle(int n) {
            for(int i=n;i>0;i--){
                for(char ch='A';ch<'A'+i;ch++){
                    System.out.print(ch+" ");
                }
                System.out.println();
            }
        }
}
