package recursion;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num to find factirial");
        int n = sc.nextInt();
        int ans = calFact(n);
        System.out.println(ans);
    }

    public static int calFact(int n) {
        // base condition
        if(n == 1 || n == 0) {
            return 1;
        }
        int fact_nm1 = calFact(n-1);
        int fact = n * fact_nm1;
        return fact;
    }
}
