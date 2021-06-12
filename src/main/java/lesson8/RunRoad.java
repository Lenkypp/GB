package lesson8;

public class RunRoad implements Fitness{
    public int size;

    public RunRoad(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }
}

