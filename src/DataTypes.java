import java.sql.SQLOutput;

public class DataTypes {
    public static void main(String[] args) {
        // Variables: int
        int numberOfStudents = 30;
        int maxScore = 100;
        System.out.println(numberOfStudents);
        System.out.println(maxScore);

        // Variable: double
        double temperature = 3.4;
        double price = 599.99;
        System.out.println(temperature);
        System.out.println(price);

        // Variables: float
        float pi = 3.14f;
        float radius = 5.5f;
        float area = pi * radius * radius;
        System.out.println(area);

        // Costing
        int areaInteger = (int) area;
        System.out.println(areaInteger);

        // Char
        char symbol = '$';
        System.out.println(symbol);

        // Excercise:
        char l = 76;
        System.out.println(l);
        char e = 69;
        System.out.println(e);
        char n = 78;
        System.out.println(n);
        char a = 65;
        System.out.println(a);

        //Boolean is/has
        boolean isRaining = false;
        boolean hasPassedExcercise = true;
        boolean isSummer = false;
        System.out.println(isRaining);
        System.out.println(hasPassedExcercise);
        System.out.println(isSummer);
    }
}
