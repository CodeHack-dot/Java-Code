package Patterns_Problems;

public class p_14 {
    static void main() {
        int n = 5;
        var count = 1;
        for(int row= 1; row<=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print(count+" ");
                count++;
            }
            System.out.println();
        }
    }
}
