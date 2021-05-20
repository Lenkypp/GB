package lesson1;

public class Main {
//    Домашнее задание  ------------------------
//    1.Создать пустой проект в IntelliJ IDEA и прописать метод main().
    public static void main(String[] args) {
        System.out.println("1.Создали пустой проект в IntelliJ IDEA и прописали метод main()");
//    2.Создать переменные всех пройденных типов данных и инициализировать их значения.
        byte    bb = -12;
        short   ss = 13;
        int     ii = 1000;
        long    ll = 2233000L;
        float   ff = 567.34f;
        double  dd = - 345.34;
        char    cc = 'D';
        boolean boo = true;
        System.out.println("2.Cоздали переменные разных типов и инициализировали их.");

        //3-проверка--------------
        float   a = 5.55f, b = 4.45f, c = 9f, d=3f;
        float q3 = calculate(a, b, c, d);
        //4-проверка--------------
        int   e = 13, f = 6;
        compare2num(e, f);
        //5-проверка--------------
        pozitivOrNegativ(-14);
        //6-проверка--------------
        pozitivOrNegativVers6(65);
        //7-проверка--------------
        printName("Александр");

        //8-проверка--------------
        tipeYear(2010);

    }
//    3.Написать метод вычисляющий выражение a * (b + (c / d)) и возвращающий результат,
//    где a, b, c, d – аргументы этого метода, имеющие тип float.
    public static float calculate(float a, float b, float c, float d) {
        float q3;
        q3 = a * (b + (c / d));
        System.out.println("3.Вычисляем выражение, пример a * (b + (c / d))=" + q3);
        return q3;
    }

//    4.Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма
//    лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    public static Boolean compare2num(int a, int b) {
        Boolean rezult;
        rezult = (a+b>=10 && a+b<=20);
        System.out.println("4.Сумма "+(a+b)+" в пределах от 10 до 20 (включительно) ? "+rezult);
        return rezult;
    }
//    5.Написать метод, которому в качестве параметра передается целое число, метод должен
//    напечатать в консоль, положительное ли число передали или отрицательное.
//    Замечание: ноль считаем положительным числом.
    public static void pozitivOrNegativ(int a) {
        if (a>=0) {
            System.out.println("5.Число "+a+" положительное");
        }else{
            System.out.println("5.Число "+a+" отрицательное");
        }
     }
//   6.Написать метод, которому в качестве параметра передается целое число. Метод
//    должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static Boolean pozitivOrNegativVers6(int a) {
        boolean rezult;
        rezult = (a>=0);
        if (rezult) {
            System.out.println("6.Число "+a+" положительное, возвращаем "+rezult);
        }else{
            System.out.println("6.Число "+a+" отрицательное, возвращаем "+rezult);
        }
        return rezult;
    }

//   7. Написать метод, которому в качестве параметра передается строка, обозначающая имя.
//    Метод должен вывести в консоль сообщение «Привет, указанное_имя!».
    public static void printName(String name00) {
        System.out.println("Привет, "+name00+"!");
    }
//  8.*Написать метод, который определяет, является ли год високосным,
//    и выводит сообщение в консоль. Каждый 4-й год является високосным,
//    кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static void tipeYear(int yyyy) {
        String tipe;
        if (yyyy%4==0) {
            if (yyyy%400==0){
                tipe ="високосный";
            }else{
                if (yyyy%100==0) {
                    tipe ="не високосный";
                }else{
                    tipe ="високосный";
                }
            }
                ;
        }else{
            tipe ="не високосный";
        }

        System.out.println("8.Год "+yyyy+" "+tipe);

    }

    
}
