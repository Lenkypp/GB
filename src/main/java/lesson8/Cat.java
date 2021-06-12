package lesson8;

public class Cat implements Fitness{
    private String name;
    private int maxRun;
    private int maxJump;

    public Cat(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public String toString() {
        return "{Кот name='" + name + '\'' +
                " maxRun='" + maxRun + '\'' +
                " maxJump='" + maxJump + '\'' +
                '}';
    }

    @Override
    public int getMaxRun() {
        return maxRun;
    }

    @Override
    public int getMaxJump() {
        return maxJump;
    }

}
