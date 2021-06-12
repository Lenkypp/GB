package lesson8;

public class RunRoad implements Equipments{
    private int size;

    public RunRoad(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }
}

