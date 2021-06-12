package lesson8;
//1.	Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
// Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
//2.	Создайте два класса: беговая дорожка и стена, при прохождении через которые,
// участники должны выполнять соответствующие действия (бежать или прыгать),
// результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
//3.	Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
//4.	* У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
// Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.

import java.util.ArrayList;
import java.util.List;

public class MainClass8 {

    public static void main(String[] args) {
        Boolean isRun ;
        Man man = new Man("Вася",10000,2);
        Robot rob = new Robot("Робот Зазнайка",2000,1);
        Cat cat = new Cat("Мурзик",1000,3);


        Object[] allObj = new Object[3];
        Object[] allFitness = new Object[3];

        allObj[0]= man;
        allObj[1]= rob;
        allObj[2]= cat;

//      List<Object> allObjects = new ArrayList<>();

        for (Object obj : allObj) {
            System.out.println(obj.toString());
            if (obj instanceof Fitness) {
                if (obj.getClass() == man.getClass()) {
                    ((Fitness) obj).run(3000, ((Man) obj).getMaxRun());
                }
               else if (obj.getClass() == rob.getClass()) {

                    if (!rob.run(11000, rob.getMaxRun())) {
                        System.out.println("увы..");
                    }
                    if (!rob.jump(3, rob.getMaxJump())) {
                        System.out.println("увы..");

                        ((Fitness) obj).run(3000, ((Robot) obj).getMaxRun());
                    }
                }
                else if (obj.getClass() ==cat.getClass()) {
                    ((Fitness) obj).run(3000, ((Cat) obj).getMaxRun());
                   }
            }
//            animal.run(100);
//            animal.jump(1.9);
//            if (animal instanceof Swimmable) {
//                Swimmable swimmable = (Swimmable) animal;// int a = ( int ) Math.random();
//                swimmable.swim(5);
//            }
        }



    }


}//
