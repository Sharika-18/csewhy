/*
Aryan and his friends are very fond of the pattern. They want to make the Reverse N-Number Crown for a given integer' N'.
Given 'N', print the corresponding pattern.
Example:
Input: ‘N’ = 3
Output: 
1         1
1 2     2 1
1 2 3 3 2 1
 */
public class pattern12 {
        public static void numberCrown(int n) {
            for(int i=0;i<n;i++){
                for(int j=0;j<=i;j++){
                    System.out.print(j+1+" ");
                }
                for(int j=0;j<(2*n-1)-(2*i+1);j++){
                    System.out.print(" "+" ");
                }
                for(int j=i;j>=0;j--){
                    System.out.print(j+1+" ");
                }
                System.out.println();
            }
        }
}
