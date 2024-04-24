/*
Sam is curious about Alpha-Hills, so he decided to create Alpha-Hills of different sizes.
An Alpha-hill is represented by a triangle, where alphabets are filled in palindromic order.
For every value of ‘N’, help sam to return the corresponding Alpha-Hill.
Example:
Input: ‘N’ = 3
Output: 
    A
  A B A
A B C B A
 */
public class pattern17 {
        public static void alphaHill(int n) {
            for(int i=0;i<n;i++){
                for(int j=0;j<n-i-1;j++){
                    System.out.print(" ");
                }
                char ch='A';
                int breakp= (2*i+1)/2;
                for(int j=0;j<2*i+1;j++){
                    System.out.print(ch+" ");
                    if(j+1<=breakp){
                        ch++;
                    }else{
                        ch--;
                    }
                }
                for(int j=0;j<n-i-1;j++){
                    System.out.println(" ");
                }
                System.out.println();
            }        
        }
}
