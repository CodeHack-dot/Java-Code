package Patterns_Problems;

public class p_5 {
    static void main(String[] args) {
        int n = 5;
        for(int row=1; row<=n; row++){
            for(int spc= 1; spc<=n-row; spc++){
                System.out.print("  ");
            }
            for(int str = 1; str<=(row*2)-1; str++){
                System.out.print("* ");
            }
            for(int spc= 1; spc<=n-row; spc++){
                System.out.print("  ");
            }
            System.out.println();
        }
    }
}
