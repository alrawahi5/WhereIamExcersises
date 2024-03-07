import java.util.Arrays;
import java.util.Scanner;

public class BestTimetoBuyandSellStock {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int arrySize = 0;

        System.out.println("Specify the size of the array: ");
        if (scanner.hasNext()){
            arrySize = scanner.nextInt();
        }
        final Integer[] nubers = new Integer[arrySize]; ////

        int count = 0;
        System.out.println("Fill in your Array of size " + arrySize + ": " + "\nday " + count++ + " #:");
        for (int i = 0; i < arrySize; i++){
            if(scanner.hasNext()){
                System.out.println("day " + count++ + " #:");
                nubers[i] = scanner.nextInt();
            }
        }
        System.out.println("Your Array contains the following elements:");
        for (int i = 0; i < arrySize; i++){
            System.out.print(nubers[i]  + " ");
        }
        System.out.println();

        Integer[] arrayNumbersSortedForMin = Arrays.copyOfRange(nubers, 0, nubers.length);
        Arrays.sort(arrayNumbersSortedForMin);
        int minValue = arrayNumbersSortedForMin[0];
        int minValueIndex = 0;
        for (int i = 0; i < nubers.length; i++) {
            if (nubers[i].equals(minValue)) {
                minValueIndex = i;
            }
        }
        Integer[] arrayAfterBuying = Arrays.copyOfRange(nubers, minValueIndex, nubers.length);

        Integer[] arrayNumbersSortedForMax = Arrays.copyOfRange(arrayAfterBuying, 0, arrayAfterBuying.length);
        Arrays.sort(arrayNumbersSortedForMax);
        Integer maxValue = arrayNumbersSortedForMax[arrayNumbersSortedForMax.length-1];
        Integer maxValueAfterBuyingIndex = 0;
        for (int i = 0; i < arrayAfterBuying.length; i++) {
            if(maxValue.equals(arrayAfterBuying[i])){
                maxValueAfterBuyingIndex = i;
            }
        }

        if (maxValueAfterBuyingIndex > minValueIndex) {
            System.out.println(maxValue - minValue);
        }
        else {
            System.out.println("No profit, beter not buy! " + (maxValue - minValue));
        }
    }
}
