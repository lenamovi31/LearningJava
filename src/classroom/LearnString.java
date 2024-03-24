package classroom;

public class LearnString {
    public static void main(String[] args) {

        // String
        String name = "Jelena";
        String lastName = "Dudevica";

        System.out.println(name);
        System.out.println(lastName);

        // Excercise: Print name and surname
        // Concatenation
        String fullName = name + " " + lastName;
        System.out.println(fullName);

        // or
        System.out.println(name + " " + lastName);

        System.out.println(String.format("%s %s", name, lastName));

        //Can save into variables
        String myfullName = String.format("%s %s", name, lastName);
        System.out.println(myfullName);

        //Hello, World!
        String hello = "Hello, ";
        String world = "world!";

        String helloWorld = hello.concat(world);
        System.out.println(helloWorld);

        //Ex:
        //1. Name
        //2. Java
        //3. Concatenate = "My name is NAME. I love coding in LANGUAGE"
        //4. Print out
        String myName = "My name is Lena.";
        String language = "I love coding in Java.";
        String iLoveJava = String.format("%s %s", myName, language);
        System.out.println(iLoveJava);

        String randomString = "some text";
        System.out.println(randomString.toUpperCase());
    }
}
