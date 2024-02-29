import java.util.Scanner;
import java.util.Stack;

public class ValidatePalindrom {
    public static boolean validPalindrome() {
        boolean flag = true;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the tested word: ");
        String word = scanner.nextLine().toLowerCase().replaceAll("[^\\\\sa-zA-Z0-9]", "");
//        System.out.println(word);
        Stack<Character> myCharWord = new Stack<Character>();
        Stack<Character> myCharWordRev = new Stack<Character>();

        for (int i = 0; i<word.length(); i++) {
            myCharWord.push(word.charAt(i));
            }
        //System.out.println("Original: " + myCharWord);

        for (int i = 0; i<word.length()+1; i++) {
            if (!myCharWord.empty()) {
                myCharWordRev.push(myCharWord.pop());
            }
        }
        //System.out.println("Rev: "+myCharWordRev);

        for (int c = 0; c<myCharWordRev.size(); c++) {
            if (myCharWord.push(myCharWordRev.pop()).equals(myCharWordRev.elementAt(c))) {
                System.out.println("yes");
                return flag;
            } else {
                System.out.println("no");
                flag = false;
                return flag;
            }
        }
        return flag;
    }

    public static void main(String [] args){
        validPalindrome();
    }
}
