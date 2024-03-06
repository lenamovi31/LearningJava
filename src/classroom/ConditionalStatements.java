package classroom;

public class ConditionalStatements {
    public static void main(String[] args) {

        // If statement

        if (true) {
            System.out.println("This code is executed.");
        }

        int x = 10;
        if (x > 5) {
            System.out.println("x is greater than 5");
        }

        if(x>12) {
            System.out.println("x is greater that 12");
        }

        boolean isSpring = true;
        if(isSpring) {
            System.out.println("It is spring");
        }

        int age = 10;
        if (age <= 12) {
            System.out.println("This is a child!");
        } else {
            System.out.println("Something else!");
        }

        if (age <= 12) {
            System.out.println("This is a child!");
        } else if (age >= 13 && age <= 19) {
            System.out.println("This is a teenager!");
        } else if (age >= 20 && age <= 59) {
            System.out.println("This is an adult!");
        } else {
            System.out.println("This is a senior!");
        }

        int number = 0;
        if (number == 0) {
            System.out.println("This is zero!");
        } else if (number > 0) {
            System.out.println("This is a positive number!");
        } else if (number < 0) {
            System.out.println("This is a negative number!");
        }
        //
        int time = 5;
        if (time >= 0 && time <= 11) {
            System.out.println("Good morning!");
        } else if (time >= 12 && time <= 17) {
            System.out.println("Good afternoon!");
        } else if (time >= 18 && time <= 23) {
            System.out.println("Good evening!");
        } else {
            System.out.println("Invalid hour provided!");
        }


    }
}
