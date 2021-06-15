package lesson9;

//1 Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4.
// При подаче массива другого размера необходимо бросить исключение MyArraySizeException.
//2 Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
// Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст вместо числа),
// должно быть брошено исключение MyArrayDataException с детализацией, в какой именно ячейке лежат неверные данные.
//3 В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException
// и MyArrayDataException и вывести результат расчета.
//

import java.util.stream.Stream;

public class mainClass9 {
    public static void main(String[] args) {
        String[][] arrGood = new String[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                arrGood[i][j] = "1"+i;
                if (j == 3) {
                    //bad cells
                    arrGood[i][j] = "aa"+i;

                }
                System.out.print(arrGood[i][j]+ " ");
            }
            System.out.println();

        }

        String[][] arrBad5 = new String[5][5];
        String[][] arrBad3 = new String[3][4];

        System.out.println(arrGood.length+ " - good row length");
        System.out.println(arrGood[0].length+ " -good column length");



        recieveArr(arrGood);
        recieveArr(arrBad5);




    }//main

    public static void recieveArr(String[][] arrS) {
        int arrRow = arrS.length;
        int arrColumn = arrS[0].length;
        int number;
        if (arrRow != 4 || arrColumn != 4) {
            MyArraySizeException except = new MyArraySizeException("Размер массива не соответствует 4х4! "+arrRow+"x"+arrColumn);
            return;
        } else {
            System.out.println("Размер массива соответствует 4х4, ok.");
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                try {
                    number = Integer.parseInt(arrS[i][j]);

                    System.out.print(number + " ");
                    number =0;
                } catch (ClassCastException e) {
                    MyArrayDataException except = new MyArrayDataException(i, 1);

                } catch (NumberFormatException e) {
                    MyArrayDataException except = new MyArrayDataException(i, 1);
                } catch (ArrayIndexOutOfBoundsException e) {
                    MyArrayDataException except = new MyArrayDataException(i, 1);
                    //e.printStackTrace();
                } finally {
                    number =0;
                }//try


            }   //for
            System.out.println();
        }//for
    }
}//class
