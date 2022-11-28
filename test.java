
import java.util.Arrays;
public class test{
    public static void main(String[] args) {
        int[] A={2,5,1,3};
        Arrays.sort(A);
        System.out.println(A[0]);
        int B = A[0];
        int C=1;
          if(C<A.length-1){
             B=B+1;
             int find = B;
              for(int element:A){
                 if(element==find){
                     C++;
                 }else
                   System.out.println("The missing element is "+ B);

                }
            }
    }
}