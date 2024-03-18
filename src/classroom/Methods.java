package classroom;

public class Methods {
    public static void main(String[] args) {

        System.out.println(calculateSum(44, 20));

        // Print: Hello World 10 times
        printTextMultipleTimes("Hello World!", 10);

        // Call method printAllValuesFromStringArray
        // You pass: array with fruits;

        String[] fruits = {"Apple", "Banana", "Pear", "Strawberry"};
        printValuesFromStringArray(fruits);

        System.out.println(isEven( 10));

        int[] numbers = {2, 4, 7,8, 10};
        int arraySum = printSumOfArrayNumbers(numbers);
        System.out.println(arraySum);

    }

    private static void printValuesFromStringArray(String[] fruits) {
    }

    public static int calculateSum(int x, int y) {
        return x + y;
    }

    public static void printTextMultipleTimes(String text, int repeatCount) {
        for (int i = 0; i < repeatCount; i++) {
            System.out.println(text);
        }
    }

    // Task: create a method that receives String array and print all values

    public static void printAllValuesFromStringArray(String[] stringArray) {
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
    }

    // Create method that will return true if number is even or false if odd;

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Task: create method that accepts int array and returns sum of number;

    private static int printSumOfArrayNumbers(int[] numbers) {
        int summa = 0;
        for (int i = 0; i < numbers.length; i++) {
            summa = summa + numbers[i];
        }
        return summa;
    }
}
