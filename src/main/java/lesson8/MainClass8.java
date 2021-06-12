package lesson8;
//1.	Создайте три класса Человек, Кот, Робот, которые не наследуются от одного класса.
// Эти классы должны уметь бегать и прыгать (методы просто выводят информацию о действии в консоль).
//2.	Создайте два класса: беговая дорожка и стена, при прохождении через которые,
// участники должны выполнять соответствующие действия (бежать или прыгать),
// результат выполнения печатаем в консоль (успешно пробежал, не смог пробежать и т.д.).
//3.	Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти этот набор препятствий.
//4.	* У препятствий есть длина (для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
// Если участник не смог пройти одно из препятствий, то дальше по списку он препятствий не идет.

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MainClass8 {

    public static void main(String[] args) {

        Boolean isAct ;
        Man man     = new Man("Вася",12000,2);
        Robot rob   = new Robot("Робот Зазнайка",2000,1);
        Cat cat     = new Cat("Мурзик",11000,3);

        RunRoad runRoad = new RunRoad(9000);
        Wall wall = new Wall(2);

        int[] arrLenth = {12000, 8000, 15000};
        int[] arrHeight = {3, 1, 2};

        Fitness[] arrObj = new Fitness[3];

        arrObj[0]= man;
        arrObj[1]= rob;
        arrObj[2]= cat;



        Equipments[] arrEquipments = new Equipments[2];

        arrEquipments[0]= runRoad;
        arrEquipments[1]= wall;

          for (Fitness obj : arrObj) {
            System.out.println(obj.toString());

            int e = 0;
            for (Equipments equipment : arrEquipments) {
                    if (equipment instanceof RunRoad) {
                        isAct = obj.run(arrLenth[e], obj.getMaxRun(), ((RunRoad) equipment));

                    }else{
                        isAct = obj.jump(arrHeight[e], obj.getMaxJump(), ((Wall) equipment));

                    }
                    e++;
                if (!isAct) {
                    break;

                }
                 }

        }


    }


}//
