package Patterns_Problems;

public class p_3 {
    static void main(String[] args) {
        int n= 5;
        for(int row= 1; row<=5; row++){
           for(int col=1; col<=n-row; col++){
               System.out.print("  ");
           }
           for(int col = 1; col<=n; col++){
               System.out.print("* ");
           }
           System.out.println();
        }
    }
}
