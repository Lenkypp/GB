package lesson6;

public class Dog extends Animal{
    public Dog(String name) {
        super(name, 500, 10, 0.5f, "Собака");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void run(int lenth) {
        super.run(lenth);
    }

    @Override
    protected void swim(int lenth) {
        super.swim(lenth);
    }

    @Override
    public void printCount() {
        super.printCount();
    }

    @Override
    public void jump(float height) {
        super.jump(height);
    }
}// class
