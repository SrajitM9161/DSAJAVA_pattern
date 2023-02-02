package PATTERNS;

import java.util.Scanner;

/*
1 2 3 4 5
1 2 3 4
1 2 3
1 2

 */
public class q7_numinvertedhalfpyramid {
    public static void main(String[] args) {
        Scanner Sc= new Scanner(System.in);
        int n = Sc.nextInt();
        for (int row =0;row<n;row++){
            for (int col=0;col<n-row;col++){
                System.out.print(col+1+"  ");
            }
            System.out.print("\n");
        }
    }
}
