package lesson6;

//1.	Создать классы Собака и Кот с наследованием от класса Животное.
//2.	Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
//        Результатом выполнения действия будет печать в консоль.
//        (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
//3.	У каждого животного есть ограничения на действия
//        (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
//4.	* Добавить подсчет созданных котов, собак и животных.

public class Animal {
    protected String name;
//    protected int maxRun=500;
//    protected int maxSwim=10;

    public Animal(String name) {
        this.name = name;

    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }

    public void run(int lenth){
        System.out.println("Животное пробежало "+lenth+" м");

    }
    public void swim(int lenth){
        System.out.println("Животное проплыло "+lenth+" м");

    }





}
