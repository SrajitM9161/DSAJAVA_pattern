package PATTERNS;

import java.util.Scanner;

public class q6_numerichalfpyramid {
    public static void main(String[] args) {

        System.out.print("enter your value");
        Scanner Sc=new Scanner(System.in);
        int n= Sc.nextInt();
        for (int row=0;row<n;row++){
            for (int col=0;col<row+1 ; col++){
                System.out.print(col+1+"  ");
            }
            System.out.print("\n");
        }
    }
}

