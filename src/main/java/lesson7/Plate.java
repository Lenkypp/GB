package lesson7;

public class Plate {

    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        food -= n;
        if (n <=0 ) {
            n=0;
        }
    }
    public void info() {
        System.out.println("Еды в тарелке: " + food);

    }

    public int getFood() {
        return food;
    }

    public void addFood(int someFood){
        if (someFood > 0) {
            this.food = this.food +someFood;
            System.out.println("добавлена еда в тарелку + "+someFood+". Еды в тарелке ="+this.food);
        }

    }
}
