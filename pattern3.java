import java.util.*;
public class pattern3 {
 


    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        int sp=n-1;
        int st=1;
        // this is the main outer loop
        for(int j=1;j<=n;j++){
           //this is for printing spaces(tabs)
            for(int i=1;i<=sp;i++){
                System.out.print("\t");
            }
           //this is for printing stars 
            for(int i=1;i<=st;i++){
                 System.out.print("*\t");
            }
            sp--;
            st++;
            System.out.println();
        }
        

    }
}
    

