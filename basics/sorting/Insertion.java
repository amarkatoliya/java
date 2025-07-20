
package sorting;
import java.util.*;

public class Insertion {
    public static void main(String[] args) {
        int[] array = {24,45,3,65,22,98,53,13,0};

        for(int i=1; i < array.length; i++) {
            int curr = array[i];
            int j =i-1;

            while(j>=0 && curr < array[j]) {
                array[j+1] = array[j];
                j--;
            }

            // placement
            array[j+1] = curr;

        }
        printArray(array);
    }
    
    public static void printArray(int array[]) {
        for(int i=0; i< array.length;i++) {
            System.out.print(array[i] + " ");
        }
    }
}
