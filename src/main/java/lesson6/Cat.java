package lesson6;

public class Cat extends Animal {

    public Cat(String name) {
        super(name, 200, 0, 2f, "Кот");
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
        System.out.println("Кот не умеет плавать.");;
    }

    @Override
    public void jump(float height) {
        super.jump(height);
    }
}
