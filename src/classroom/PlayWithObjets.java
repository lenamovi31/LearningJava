package classroom;

public class PlayWithObjets {
    public static void main(String[] args) {

        Animal barsik = new Animal();
        System.out.println(barsik.getName());

        barsik.setName("Barsik");
        barsik.setAge(1);
        barsik.setColor("grey");
        System.out.println(barsik.getName());

        Animal leo = new Animal();
        leo.setName("Leo");
        leo.setAge(2);
        leo.setColor("ginger");
        System.out.println(leo.getName());

        System.out.println(barsik);
        System.out.println(leo);

        barsik.walk();
        leo.walk();

        barsik.eat();
        leo.eat();

        // Create 2 objects;
        // Update info;
        // Call walk and eat;

        Animal viwnja = new Animal();
        System.out.println(viwnja.getName());

        viwnja.setName("Viwnja");
        viwnja.setAge(7);
        viwnja.setColor("grey");
        System.out.println(viwnja.getName());

        Animal varezhka = new Animal();
        varezhka.setName("Varezhka");
        varezhka.setAge(9);
        varezhka.setColor("white");
        System.out.println(varezhka.getName());

        viwnja.walk();
        varezhka.walk();

        viwnja.eat();
        varezhka.eat();

    }
}
