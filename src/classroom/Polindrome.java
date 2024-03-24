package classroom;

import java.util.Scanner;

public class Polindrome {
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter a word:");
        String word = myScanner.nextLine();

        String iterated = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            iterated = iterated + word.charAt(i);
        }
        if(word.equals(iterated)) {
            System.out.println("This word is a polindrome!");
        } else {
            System.out.println("This word is not a polindrome!");
        }
    }
}
