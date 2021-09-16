import java.util.Scanner;

public class RightStarPattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner (System.in);
        int n = scn.nextInt();
        for(int i=1;i<=n;i++){
            for(int s=1;s<=i;s++){
            System.out.print("*\t" );
            }
            System.out.println();
        }
    }
    
}
