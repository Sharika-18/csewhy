/*
Aryan and his friends are very fond of patterns. For a given integer ‘N’, they want to make the Increasing Number Triangle.
Example:
Input: ‘N’ = 3
Output: 
1
2 3
4 5 6
 */
public class pattern13 {
        public static void nNumberTriangle(int n) {
            int start=1;
            for(int i=0;i<n;i++){
                for(int j=0;j<=i;j++){
                   System.out.print(start+" ");
                   start+=1;
                }
                System.out.println();
            }
        }
}
