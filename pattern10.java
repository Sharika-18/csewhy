/*
 Ninja was very fond of patterns. For a given integer ‘N’, he wants to make the N-Star Rotated Triangle.
Example:
Input: ‘N’ = 3
Output: 
*
**
***
**
*
 */
public class pattern10 {
        public static void nStarTriangle(int n) {
            for(int i=0;i<n;i++){
                for(int j=0;j<=i;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            for(int i=0;i<n;i++){
                for(int j=0;j<n-i-1;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }  
}
