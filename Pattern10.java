import java.util.Scanner;

public class RightStarPattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        System.out.println("Enter the number of rows you want ");
        int n = scn.nextInt();
        int val=1;
        for(int i=1;i<=n;i++){
            for(int s=1;s<=i;s++){
            System.out.print(val + "\t" );
            val++;
            }
            System.out.println();
        }
    }
    
}
