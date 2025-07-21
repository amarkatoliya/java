package recursion;

public class power {

    public static int printPower(int x, int n) {
        if(n == 0) {  // base con 1
            return 1;
        }
        if(x == 0) { // base condition 2
            return 0;
        }
        // int xm1 = printPower(x, n-1);  // work
        // int x_n = x * xm1;
        // return x_n;

        // now we use other methode

        if(n % 2 == 0) {
            return printPower(x, n/2) * printPower(x, n/2);  //if even
        }
        else{
            return printPower(x, n/2) * printPower(x, n/2) * x; //if odd
        }
    }
    public static void main(String[] args) {
        int x = 2;
        int n = 5;
        int ans = printPower(x, n);
        System.out.println(ans);
    }
    
}
