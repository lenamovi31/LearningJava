package classroom;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner newScanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int answer = newScanner.nextInt();

        System.out.println("This is multiplication table for numbber: " + answer);
        for (int i = 1; i <= 10; i++) {
            int result = answer * i;
            System.out.println(String.format("%d * %d = %d", answer, i, result));
        }
    }
}
