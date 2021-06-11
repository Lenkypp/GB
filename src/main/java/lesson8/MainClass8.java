package lesson8;

public class MainClass8 {

    public static void main(String[] args) {
        Man man = new Man("Вася",8000,2);
        RunRoad road = new RunRoad(2);

        System.out.println(man.toString());

        man.run(4000);
        man.jump(3);


        road.somebodyRun(man.getName(),20);
    }


}
