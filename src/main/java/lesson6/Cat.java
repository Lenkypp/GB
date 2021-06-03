package lesson6;

public class Cat extends Animal {
    private int maxRun = 200;
    private int maxSwim =0;

    public Cat(String name) {
        super(name);
     }

    @Override
    public String toString() {
        return "Кот{" +
                "name='" + name + '\'' +
                '}';

    }

    @Override
    public void run(int lenth) {
        System.out.println("Кот пробежал "+((lenth<maxRun) ? lenth :maxRun)+" м");
    }

   }
