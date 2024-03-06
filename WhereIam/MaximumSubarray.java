import java.util.Scanner;
import java.util.Arrays;

public class MaximumSubarray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int arrySize = 0;

        System.out.println("Specify the size of the array: ");
        if (scanner.hasNext()){
            arrySize = scanner.nextInt();
        }
        int[] nubers = new int[arrySize];

        int count = 0;
        System.out.println("Fill in your Array of size " + arrySize + ": " + "\nelement #: " + count++);
        //scanner.nextInt();
        for (int i = 0; i < arrySize; i++){
            if(scanner.hasNext()){
                System.out.println("elemet #: " + count++);
                nubers[i] = scanner.nextInt();
            }
        }
        System.out.println("Your Array contains the following elements:");
        for (int i = 0; i < arrySize; i++){
            System.out.print(nubers[i]  + " ");
        }
        System.out.println();
        System.out.println("the largest sum of the array is: ");
        int sumArray = 0;
        int[] whatHolds = new int[arrySize];
        whatHolds[0] = nubers[0];
        sumArray = whatHolds[0];
        for(int i = 1; i<nubers.length; i++){
            //sumArray = Math.max(sumArray, nubers[i]);
            whatHolds[i] = Math.max(nubers[i], nubers[i] + whatHolds[i-1]);
            sumArray = Math.max(sumArray, whatHolds[i]);
        }
        System.out.print(sumArray);
    }
}
