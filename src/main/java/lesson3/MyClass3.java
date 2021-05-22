package lesson3;

import java.util.Random;
import java.util.Scanner;

public class MyClass3 {
    //=======Домашнее задание=====
//    1.Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
//    При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
//    После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
    public static void main(String[] args) {

        int zagadka, otvet = 11;
        Boolean isWinner  = false;

        zagadka = getRandom();

        for (int i = 1; i <= 3; i++) {
            otvet = getNumberFromScanner("Угадайте число в пределах от 0 до 9.Попытка "+i+" из 3. Ваш ответ:", 0, 9);
            System.out.println("--- ");
            if (zagadka==otvet) {
                isWinner = true;
                break;
            }else{
                System.out.println("Ваше число "+otvet + (otvet< zagadka ? " меньше.": " больше."));

            }


        }// for i =1

        System.out.print("****** ");

        if (isWinner){
            System.out.println("Поздравляем! Вы выграли! Загадочное число = " + zagadka+" ******");

        }else{
            System.out.println("Печально.Вы не угадали. Загадочное число = " + zagadka+" ******");

        }


    }

    public static Scanner sc = new Scanner(System.in);

     public static int getNumberFromScanner(String message, int min, int max) {
        int x;
        do {
            System.out.println(message);
            x = sc.nextInt();
        } while (x < min || x > max);
        return x;
    }

    public static int getRandom() {
        Random random = new Random();
        int nextInt = random.nextInt(9);

        return nextInt;

    }

//    2.* Создать массив из слов
//    String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"}.
//            При запуске программы компьютер загадывает слово, запрашивает ответ у пользователя, сравнивает его с загаданным словом и сообщает, правильно ли ответил пользователь. Если слово не угадано, компьютер показывает буквы, которые стоят на своих местах.
//    apple – загаданное
//    apricot - ответ игрока
//    ap############# (15 символов, чтобы пользователь не мог узнать длину слова)
//    Для сравнения двух слов посимвольно можно пользоваться:
//    String str = "apple";
//    char a = str.charAt(0); - метод, вернет char, который стоит в слове str на первой позиции
//    Играем до тех пор, пока игрок не отгадает слово.
//    Используем только маленькие буквы.


} //public class MyClass3
