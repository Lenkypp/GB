package lesson8;

public class Wall implements Equipments{
    private int size ;

    public Wall(int size) {
        this.size = size;
    }

    @Override
    public int getSize() {
        return size;
    }
}
