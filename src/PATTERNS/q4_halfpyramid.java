package PATTERNS;

import java.util.Scanner;

//*
//**
//***
//****
//*****
public class q4_halfpyramid {
    public static void main(String[] args) {
        System.out.print("enter your value");
        Scanner Sc=new Scanner(System.in);
       int n= Sc.nextInt();
       for (int row=0;row<n;row++){
           for (int col=0;col<n ; col++){
               if (col<row+1){
                   System.out.print("* ");
               }
               else {
                   System.out.print(" ");
               }
           }
            System.out.print("\n");
       }
    }
}
