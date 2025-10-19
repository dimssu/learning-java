import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args){
        int[] array = {6,3,5,2,7,9};

        for (int i = 0; i<array.length; i++){
            int small = array[i];
            int minIndex = i;
            for (int j = i; j<array.length; j++){
                if (array[j]<small){
                    small = array[j];
                    minIndex = j;
                }
            }
            array[minIndex] = array[i];
            array[i] = small;
        }
        System.out.println(Arrays.toString(array));
    }
}
