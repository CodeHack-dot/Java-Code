package Patterns_Problems;

public class p_10 {
    static void main() {
        int n = 4;
        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= (row * 2) - 1; col++) {
                System.out.print("* ");
            }
            for (int col = 1; col <= n - row; col++) {
                System.out.print("  ");
            }
            System.out.println();
        }
        for (int row2 = n + 1; row2 <= (n * 2) - 1; row2++) {
            for (int col = 1; col <= row2 - 4; col++) {
                System.out.print("  ");
            }
            for (int col = 1; col <= (n * 2) - ((row2 - 4) * 2) - 1; col++) {
                System.out.print("* ");
            }
            for (int col = 1; col <= row2 - 1; col++) {
                System.out.print("  ");
            }
            System.out.println();
        }
    }


////Other approach

//    static void main() {
//        int n = 5;
//        for (int row = 1; row <= n; row++) {
//            for (int spc = 1; spc <= n - row; spc++) {
//                System.out.print("  ");
//            }
//            for (int str = 1; str <= (row * 2) - 1; str++) {
//                System.out.print("* ");
//            }
//            for (int spc = 1; spc <= n - row; spc++) {
//                System.out.print("  ");
//            }
//            System.out.println();
//        }
//        for (int row = 1; row <= n; row++) {
//            if (row == 1) {
//                continue;
//            }
//            for (int col = 1; col <= row - 1; col++) {
//                System.out.print("  ");
//            }
//            for (int col = 1; col <= (n * 2) - (row * 2) + 1; col++) {
//                System.out.print("* ");
//            }
//            for (int col = 1; col <= row - 1; col++) {
//                System.out.print("  ");
//            }
//            System.out.println();
//        }
//    }

}