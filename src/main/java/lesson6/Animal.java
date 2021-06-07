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
    private int maxRun;
    private int maxSwim;
    private float maxJump;
    protected String typeAnimal;

    protected int count=0;

    public Animal(String name, int maxRun, int maxSwim, float maxJump, String typeAnimal) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxSwim = maxSwim;
        this.maxJump = maxJump;
        this.typeAnimal=typeAnimal;
        count++;


    }

    @Override
    public String toString() {
        return "{"+typeAnimal +
                " name='" + name + '\'' +
                " run='" + name + '\'' +
                '}';
    }


    public void run(int lenth){
//      System.out.println(typeAnimal +" пробежал "+((lenth<maxRun) ? lenth :maxRun)+" м");
        actionInt(lenth,maxRun,"бегает");
    }
    protected void swim(int lenth){
//      System.out.println(typeAnimal +" плавает "+((lenth<maxSwim) ? lenth :maxSwim)+" м");
        actionInt(lenth,maxSwim,"плавает");
    }



    public void jump(float height) {
 //      System.out.println(typeAnimal +" прыгает в высоту на "+((height<maxJump) ? height :maxJump)+" м");
        actionInt(height,maxJump,"прыгает в высоту");

    }

    public void printCount() {
        System.out.println("количество животных = "+count);

    }
    public void actionInt(int arg , int maxArg,String action) {
        if (arg>maxArg) {
            System.out.println(typeAnimal+" "+action+" "+maxArg+" м");

        }else {
            System.out.println(typeAnimal+" "+action+" "+arg+" м");

        }

    }

    public void actionInt(float arg , float maxArg,String action) {
        if (arg>maxArg) {
            System.out.println(typeAnimal+" "+action+" "+maxArg+" м");

        }else {
            System.out.println(typeAnimal+" "+action+" "+arg+" м");

        }

    }


}
