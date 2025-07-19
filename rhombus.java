import java.util.*;

public class rhombus {
    public static void main(String[] args) {
        int n = 5;
        // print rhombus
        for(int i = 1; i <=n; i++) {
            // print spaces first
            for(int j = 1; j <= n-i; j++) {
                System.out.print(" ");
            }
            // print star
            for(int j = 1; j <= n; j++) {
                if(i==1 || i == n || j == 1 || j == n){
                    System.out.print("*");
                } else {
                    System.out.print(" "); // print rhobus with only boundry
                }
            }
            System.out.println();
        }
    }
}