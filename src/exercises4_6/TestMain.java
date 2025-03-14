package exercises4_6;

public class TestMain {
    public static void main(String[] args) {

        Animal animal = new Animal("Animal1");
        System.out.println(animal);

        Mammal mammal = new Mammal("Mammal1");
        System.out.println(mammal);

        Cat cat = new Cat("Kitty");
        System.out.println(cat);
        cat.greets();

        Dog dog1 = new Dog("Rex");
        System.out.println(dog1);
        dog1.greets();

        Dog dog2 = new Dog("Buddy");
        dog1.greets(dog2);
    }
}
