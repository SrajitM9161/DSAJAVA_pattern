package PATTERNS;


import java.util.Scanner;

public class q9_hollowinvertedpyramid {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        int n = Sc.nextInt();
        for (int row =0;row<n;row++){
            for (int col=0;col<n;col++){
if (row ==0 || col==0 || col==n-row-1){
    System.out.print("* ");
}
else {
    System.out.print("  ");
}

            }
            System.out.print("\n");
        }
    }
}


