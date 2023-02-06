package PATTERNS;
//
//* * * * *
//*       *
//* * * * *

public class q2_hollowrectn {
    public static void main(String[] args) {
for (int i=0;i<3;i++){
    if (i==0 || i==2){
        for (int j=0;j<5;j++){
            System.out.print("* ");
        }
    }
   else {
        System.out.print("* ");
        for (int k=0;k<3;k++){
            System.out.print("  ");
        }
        System.out.print("* ");
    }
    System.out.print("\n");
}

    }

}

//    int row = 5, col = 5;
//        for (int i = 0; i <= row; i++) {
//                for (int j = 0; j <= col; j++) {
//                if (i == 0 || i == row || j == 0 || j == col) {
//                System.out.print("* ");
//                } else {
//                System.out.print("  ");
//                }
//                }
//                System.out.println();
//                }
//                }
//                }
