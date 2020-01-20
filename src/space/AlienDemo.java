package space;

public class AlienDemo {

    public static void main(String[] args) {
        Alien mike = new Alien("Mike", 1.92d, 115.0d);
        Alien clone1 = (Alien)mike.createClone();
        Alien clone2 = (Alien)mike.createClone();
        Alien clone3 = (Alien)mike.createClone();
        Alien clone4 = (Alien)mike.createClone();

        clone1.setName("Mike1");
        clone2.setName("Mike2");
        clone3.setName("Mike3");
        clone4.setName("Mike4");

        System.out.println(mike);
        System.out.println(clone1);
        System.out.println(clone2);
        System.out.println(clone3);
        System.out.println(clone4);
    }
}
