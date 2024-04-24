/*
Sam is researching on Alpha-Triangles. So, he needs to create them for different integers ‘N’.
An Alpha-Triangle is represented by the triangular pattern of alphabets in reverse order.
For every value of ‘N’, help sam to print the corresponding Alpha-Triangle.
Example:
Input: ‘N’ = 3
Output: 
C
C B 
C B A
 */
public class pattern18 {
        public static void alphaTriangle(int n){
            for(int i=0;i<n;i++){
                for(int j=0;j<=i;j++){
                    System.out.print((char)(int)(('A'+n-1)-j)+" ");
                }
                System.out.println();
            }
        }
}
