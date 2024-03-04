import java.lang.String;
import java.util.Arrays;
import java.util.Scanner;

public class ValidAnagram {

    public static Scanner scanner = new Scanner(System.in);

    public static boolean testAnagram(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }

        System.out.println("enter the first word: ");
        word1 = scanner.nextLine();
        char[] firstInput = word1.toCharArray();
        System.out.println("enter the second word: ");
        word2 = scanner.nextLine();
        char[] secondInput = word2.toCharArray();


        Arrays.sort(firstInput);
        Arrays.sort(secondInput);
        return Arrays.equals(firstInput, secondInput);
    }

    public static void main(String[] args) {
        String a = "";
        String b = "";
        boolean c = testAnagram(a, b);
        System.out.println(c);
    }
}

