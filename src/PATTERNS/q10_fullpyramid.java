package PATTERNS;

import java.util.Scanner;

public class q10_fullpyramid {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int n= Sc.nextInt();
        for (int row=0;row<n;row++){
            for (int col=0;col<n-row+1;col++){
                System.out.print(" ");
            }
            for (int col=0;col<row+1;col++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}
