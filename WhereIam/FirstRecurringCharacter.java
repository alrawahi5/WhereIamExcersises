import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class FirstRecurringCharacter {

    public static void main(String[] args) {

        boolean flag = Boolean.TRUE;
        Set<Character> names = new HashSet<>();
        Scanner scannerInput = new Scanner(System.in);
        System.out.println("Enter the tested word: ");
        String inputString = scannerInput.nextLine();

        for (Integer i = 0; i < inputString.length(); i++) {

            if(!names.add(inputString.charAt(i))){
                System.out.println(inputString.charAt(i) + " is repeated ");
            }
        }
        for (Character x : names) {
            System.out.print(x);
        }
        System.out.println();
    }
}

