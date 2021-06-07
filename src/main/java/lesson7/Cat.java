package lesson7;

public class Cat {
    private String name;
    private int appetite;
    private Boolean isEat;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.isEat = false;

    }
    public void eat(Plate p) {
        if (appetite <= p.getFood()) {
            p.decreaseFood(appetite);
            this.isEat = true;
        }else{
            this.isEat = false;
        }
        System.out.println("Кот "+name + ((isEat) ? " поел("+appetite+"), сытый.": " не поел, голодный.") +" остаток в тарелке="+p.getFood());
    }


}
