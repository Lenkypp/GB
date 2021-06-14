package lesson9;

//1 Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
// При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//2 Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
// Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
// должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
//3 В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException
// и MyArrayDataException и вывести результат расчета.
//

public class mainClass9 {
    public static void main(String[] args) {
        String[][] arrS = new String[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arrS[i][j] = "1"+i;
                System.out.print(arrS[i][j]+ " ");
            }
            System.out.println();

        }


    }//main

    public static void recieveArr(String[][] arrS) {

//        if (arrS.length<>4) {
//            System.out.println("не тот размерчик");
//
//        }


    }



}//class
