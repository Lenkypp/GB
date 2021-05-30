package lesson05;

public class MyClass5 {
//    Домашнее задание урок 6
//1.	Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст.
//2.	Конструктор класса должен заполнять эти поля при создании объекта.
//3.	Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль.


    public static void main(String[] args) {


//  4.	Создать массив из 5 сотрудников.
//            Пример:
//    Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
//    persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
// потом для каждой ячейки массива задаем объект
//    persArray[1] = new Person(...);
//...
//    persArray[4] = new Person(...);
//  5.	С помощью цикла вывести информацию только о сотрудниках старше 40 лет.
        Personal[] persArray = new Personal[5];
        persArray[0] = new Personal("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        persArray[1] = new Personal("Муромец Илья", "Богатырь>", "i.muromec@geroy.com", "+790245565870", 50000, 200);
        persArray[2] = new Personal("Никитич Добрыня", "Богатырь>", "d.nikitich@geroy.com", "+790245565871", 50000, 150);
        persArray[3] = new Personal("Попович Алеша", "Богатырь>", "a.popovich@geroy.com", "+790245565872", 50000, 100);
        persArray[4] = new Personal("Бессмертный Кащей", "Злыдень", "k.bessmertny@geroy.com", "+790245565873", 50000, 200);

        System.out.println("Информация о сотрудниках сотрудников, чей возраст больше 40 :");

        for (int i = 0; i < 5; i++) {
            if ( persArray[i].getAge()>40){
                System.out.println("==========="+(i+1)+"======");
                persArray[i].printInfoEmployee();
            }


        }

    } // public static void main


}//public class MyClass5
