package Patterns_Problems;

public class p_6 {
    static void main(String[] args) {
        int n = 4;
        for(int row = 1; row<=n;row++){
            for(int col=1; col<=row-1; col++){
                System.out.print("  ");
            }
            for(int col=1; col<=(n*2)-(row*2)+1; col++){
                System.out.print("* ");
            }
            for(int col=1; col<=row-1; col++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}

