/*
Sam is curious about symmetric patterns, so he decided to create one.
For every value of ‘N’, return the symmetry as shown in the example.
Example:
Input: ‘N’ = 3
Output: 
* * * * * * 
* *     * * 
*         * 
*         * 
* *     * * 
* * * * * * 
 */
public class pattern19 {
    public static void symmetry(int n) {
        int space=0;
        for(int i=0;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print("*"+" ");
            }
            for(int j=0;j<space; j++){
                System.out.print(" ");
            }
            for(int j=1;j<=n-i;j++){
                System.out.print("*"+" ");
            }
            space +=2;
            System.out.println();
        }
        space = 2*n-2;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            for(int j=0;j<space; j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"+" ");
            }
            space -=2;
            System.out.println();
        }

    }
}