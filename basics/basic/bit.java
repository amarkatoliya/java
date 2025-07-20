package basic;
import java.util.Scanner;

import java.util.*;
public class bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num which you want to find odd or not");
        int n = sc.nextInt();

        if((n >> 1) << 1 == n) {
            System.out.println("Nums is odd");
        }else {
            System.out.println("Num is even");
        }

    }
}
