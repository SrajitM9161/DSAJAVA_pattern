package PATTERNS;
//* * * * * *
//*         *
//*         *
//*         *
//* * * * * *

public class q3_badahollow {
    public static void main(String[] args) {
        for (int row = 0; row < 6; row++) {
            System.out.print("* ");
            if (row == 0 || row == 5) {
                for (int col = 0; col < 5; col++) {
                    System.out.print("* ");
                }
            }
            else {
                System.out.print("  ");

             for (int col=0;col<3;col++){
                 System.out.print("  ");
             }
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}
