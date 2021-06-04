package lesson6;

public class MyClass6 {

    public static void main(String[] args) {

        System.out.println();
        //======
        Dog dog = new Dog("Бобик");

        System.out.println(dog);
        dog.run(300);
        dog.swim(120);
        dog.jump(4f);

        System.out.println();

        Cat cat = new Cat("Мурзик");

        System.out.println(cat.toString());
        cat.run(400);
        cat.swim(2);
        cat.jump(3f);


    }


}
