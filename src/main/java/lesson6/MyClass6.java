package lesson6;

public class MyClass6 {

    public static void main(String[] args) {
        Animal animal = new Animal("Животное");

        System.out.println(animal.toString());
        animal.run(300);
        animal.swim(120);
        animal.printCount();

        System.out.println();
        //======
        Dog dog = new Dog("Бобик");

        System.out.println(dog.toString());
        dog.run(300);
        dog.swim(120);

        System.out.println();

        Cat cat = new Cat("Мурзик");

        System.out.println(cat.toString());
        cat.run(400);


    }


}
