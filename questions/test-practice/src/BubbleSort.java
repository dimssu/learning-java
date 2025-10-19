import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        Scanner takeInput = new Scanner(System.in);
        System.out.print("Enter the length of the array: ");
        int inputLength = takeInput.nextInt();
        takeInput.nextLine();
        int[] inputArray = new int[inputLength];
        System.out.print("Enter the space separated numbers to be sorted: ");
        String inputString = takeInput.nextLine();
        String[] inputStringArray = inputString.trim().split(" ");
        for(int i = 0; i<inputLength; i++){
            inputArray[i] = Integer.parseInt(inputStringArray[i]);
        }

        for (int i = 0; i<inputLength-1; i++){
            for (int j = 0; j<inputLength-i-1; j++){
                if (inputArray[j] < inputArray[j+1]){
                    int temp = inputArray[j];
                    inputArray[j] = inputArray[j+1];
                    inputArray[j+1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(inputArray));
    }
}
