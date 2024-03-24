package classroom;

public class Methods {
    public static void main(String[] args) {

        // task 1

        System.out.println(calculateSum(44, 20));

        // task 2 Print: Hello World 10 times
        printTextMultipleTimes("Hello World!", 10);

        // task 3
        // Call method printAllValuesFromStringArray
        // You pass: array with fruits;

        String[] fruits = {"Apple", "Banana", "Pear", "Strawberry"};
        printValuesFromStringArray(fruits);

        // task 4

        System.out.println(isEven( 10));

        // task 5

        int[] numbers = {2, 4, 7,8, 10};
        int arraySum = printSumOfArrayNumbers(numbers);
        System.out.println(arraySum);

    }
        // task 1
    public static int calculateSum(int x, int y) {
        return x + y;
    }

        // task 2: Print: Hello World 10 times
    public static void printTextMultipleTimes(String text, int repeatCount) {
        for (int i = 0; i < repeatCount; i++) {
            System.out.println(text);
        }
    }

        // Task 3: create a method that receives String array and print all values

    private static void printValuesFromStringArray(String[] fruits) {
    }
    public static void printAllValuesFromStringArray(String[] stringArray) {
        for (int i = 0; i < stringArray.length; i++) {
            System.out.println(stringArray[i]);
        }
    }

    // task 4: Create method that will return true if number is even or false if odd;

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Task 5: create method that accepts int array and returns sum of number;

    private static int printSumOfArrayNumbers(int[] numbers) {
        int summa = 0;
        for (int i = 0; i < numbers.length; i++) {
            summa = summa + numbers[i];
        }
        return summa;
    }
}
