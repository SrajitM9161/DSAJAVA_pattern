package PATTERNS;

import java.util.Scanner;

public class q12_hollowinvertedfullpyramid {
    public static void main(String[] args) {

                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the height of the pyramid: ");
                int height = sc.nextInt();

                for (int i = height; i >= 1; i--) {
                    for (int j = 1; j <= height - i; j++) {
                        System.out.print(" ");
                    }
                    for (int j = 1; j <= (2 * i) - 1; j++) {
                        if (i == height || j == 1 || j == (2 * i) - 1) {
                            System.out.print("* ");
                        } else {
                            System.out.print("  ");
                        }
                    }
                    System.out.println();
                }
            }
        }
