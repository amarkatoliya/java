
package sorting;
import java.util.*;

public class Selection {
    public static void printArray(int array[]) {
        for(int i=0; i< array.length;i++) {
            System.out.print(array[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] array = {10,9,8,7,6,5,4,3,2,1};

        for(int i=0; i< array.length-1;i++) {
            int smallest = i;
            for(int j=i+1; j<array.length;j++) {
                if(array[smallest] > array[j]) {
                    smallest = j;
                }
            }
            int temp = array[smallest];
            array[smallest] = array[i];
            array[i] =temp;
        }

        printArray(array);
    }
}
