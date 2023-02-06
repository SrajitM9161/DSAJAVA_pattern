package PATTERNS;

import java.util.Scanner;

//*****
//****
//***
//**
//*
public class q5_invertedhalfpyramid {
    public static void main(String[] args) {
            System.out.print("enter your value");
            Scanner Sc=new Scanner(System.in);
            int n= Sc.nextInt();
        for (int row=0;row<5; row++){
            for (int col=0;col<n-row;col++){
                System.out.print( "* ");
            }
            System.out.print("\n");
        }

    }
}
