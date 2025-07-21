package recursion;
// print fibonacci series
public class fibonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        System.out.print(a + ",");
        System.out.print(b + ",");
        int n = 10;
        printFib(a, b, n-2); //here we declare a and b so n = n-2
    }
    public static void printFib(int a, int b, int n){
        // base condition
        if(n==0){
            return;
        }
        int c = a + b;
        System.out.print(c + ",");
        printFib(b, c, n-1);  // we printed c so also n = n-1
    }
}
