package Patterns_Problems;

public class p_13 {
    static void main() {
        int n = 5;
        for(int row= 1; row<=5; row++){
            for (int col=1; col<=row; col++){
                System.out.print(col+" ");
            }
            System.out.println();
        }
    }
}
