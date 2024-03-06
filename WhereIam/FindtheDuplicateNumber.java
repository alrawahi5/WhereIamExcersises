
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FindtheDuplicateNumber {
    public static Set<Integer> uniqueNumbers = new HashSet<>();
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
        //Set<Integer> uniqueNumbers = new Set<Integer>();
        for(Integer x : nubers){
            if(uniqueNumbers.add(x) == false){
                System.out.println();
                System.out.println("["+x+"]" + " is a duplicate");
            }
            uniqueNumbers.add(x);
        }

        System.out.println("\nMy set is: " + uniqueNumbers);
    }
}
