package lesson6;

public class Dog extends Animal{
    private int maxRun = 500;
    private int maxSwim =10;

    public Dog(String name) {
        super(name);
     }

    @Override
    public void run(int lenth) {
        System.out.println("Собака пробежала "+((lenth<maxRun) ? lenth :maxRun)+" м");
    }

    @Override
    public void swim(int lenth) {
        System.out.println("Собака проплыла "+((lenth<maxSwim) ? lenth :maxSwim)+" м");
    }
}
