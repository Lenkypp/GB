package lesson8;

public class Man implements Fitness {
    private String name;
    private int maxRun;
    private int maxJump;

    public Man(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public String toString() {
        return "{Человек name='" + name + '\'' +
                " maxRun='" + maxRun + '\'' +
                " maxJump='" + maxJump + '\'' +
                '}';
    }

    public String getName() {
        return name;
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
