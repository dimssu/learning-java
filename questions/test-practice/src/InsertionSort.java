import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args){
        int[] array = {6,3,5,2,7,9};

        for (int i = 1; i<array.length; i++){
            int current = array[i];
            int j = i-1;
            while (j >= 0 && current < array[j]){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = current;
        }

        System.out.println(Arrays.toString(array));
    }
}
