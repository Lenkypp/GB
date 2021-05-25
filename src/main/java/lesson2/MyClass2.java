package lesson2;

import java.util.Arrays;

public class MyClass2 {
    public static void main(String[] args) {
//    Домашнее задание
//=====1.	Задать целочисленный массив, состоящий из элементов 0 и 1.
// Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. // С помощью цикла и условия заменить 0 на 1, 1 на 0;
    int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
    int arrlen = arr.length;

    System.out.println("Задание 1. заменить 0 на 1, 1 на 0");
    System.out.println(Arrays.toString(arr));

    for (int i = 0; i<arrlen; i++){
        arr[i] = (arr[i] == 1) ? 0 : 1;
    }
    System.out.println(Arrays.toString(arr));

//====2.	Задать пустой целочисленный массив размером 8.
// С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21;
        System.out.println("Задание 2. ");
    int[] arr2 = new int[8];
    arr2[0] =0;
    for (int i = 1;i<8 ; i++){
        arr2[i] = arr2[i-1] +3;

    }
    System.out.println(Arrays.toString(arr2));

//====3.	Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    System.out.println("Задание 3. числа меньше 6 умножить на 2");
    int[] arr3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        System.out.println(Arrays.toString(arr3));
    for (int i=0; i< arr3.length; i++){
        if (arr3[i]<6 ){
            arr3[i] = arr3[i]*2;
        }

    }

        System.out.println(Arrays.toString(arr3));

//====4.	Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое),
// и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
        System.out.println("Задание 4. заполнить диагональные элементы двумерного массива единицами");
        int q =5;
        int[][] arr4 = new int[q][q];

        for (int i=0; i< arr4.length; i++){
           for (int k=0; k< arr4.length; k++){
            if (i==k) {
                arr4[i][k] = 1;
            }

            // вторая диагональ
               if (i+k==arr4.length) {
                   arr4[i][k] = 1;
               }

               System.out.print(arr4[i][k]+"  ");

           }
        System.out.println();

        }


//5.	** Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
        System.out.println("Задание 5. ");
        int[] arr5 = { 1, 4, 8, 23, 81, 114, 5, 67, 34,12, 29, 66 };
        int maxElem=arr5[0], minElem =arr5[0];

//        for (int i=0; i< arr5.length; i++){
//            if (arr5[i] > maxElem ){
//                 maxElem = arr5[i];
//            }
//            if (arr5[i] < minElem ){
//                minElem = arr5[i];
//            }
//
//        }
        maxElem = Arrays.stream(arr5).max().getAsInt();
        minElem = Arrays.stream(arr5).min().getAsInt();

        System.out.println("максимальный элемент = "+ maxElem);
        System.out.println("минимальный элемент = "+ minElem);

//====6.
        int[] arr6 = { 1, 1, 1, 5, 5, 5, 5, 5, 8 };
        isEqualy(arr6);

//====7.
     sdvigMass(arr2, -3);


     } //  public static void main(


//====6.	** Написать метод, в который передается не пустой одномерный целочисленный массив,
// метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
// Примеры: checkBalance([2, 2, 2, 1, 2, 2, || 10, 1]) → true, checkBalance([1, 1, 1, || 2, 1]) → true,
// граница показана символами ||, эти символы в массив не входят.
    public static Boolean isEqualy(int[] arr6) {
         System.out.println("Задание 6. ");
    int length00 = arr6.length, lSum, rSum,k=0, q=0;
    Boolean rez=false;
    for (int i=0; i< length00; i++){
        lSum =0;
        rSum=0;
       for (k =0; k<=i;k++){
           lSum = lSum+arr6[k];
           q=k;
       }
        for (k =i+1; k<length00;k++){
            rSum = rSum+arr6[k];
        }

        if (lSum == rSum){
            rez = true;
            break;
        }
    }
        System.out.println("есть равные части в массиве = "+rez);
        for (int i =0; i<=q;i++){
            System.out.print(arr6[i]+" ");
        }
        System.out.print(" || ");

        for (int i =q+1; i<length00;i++){
            System.out.print(arr6[i]+" ");
        }
        System.out.println("");


        return rez;
    }//public static boolean isEqualy
    
//====7.	**** Написать метод, которому на вход подается одномерный массив и число n
// (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций.
// Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
// Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1]
// при n = -2 (на два влево) -> [ 6, 1, 3, 5 ].
// При каком n в какую сторону сдвиг можете выбирать сами.
    public static void sdvigMass(int[] arr7, int sdvig) {
        System.out.println("Задание 7. сдвиг в массиве на "+ sdvig);
        int vedro;
        int razm = arr7.length;
        System.out.println(Arrays.toString(arr7));

        if (sdvig>0) {
            for (int k = 1; k < sdvig; k++) {
                vedro=arr7[razm-1];
                for (int i = razm-1; i >0; i--) {
                    arr7[i] = arr7[i-1];

                }
                arr7[0]=vedro;
                System.out.println(Arrays.toString(arr7));

            }

        }else{
            for (int k = 1; k < -sdvig; k++) {
                vedro = arr7[0];
                for (int i = 0; i < razm - 1; i++) {
                    arr7[i] = arr7[i + 1];

                }
                arr7[razm - 1] = vedro;
                System.out.println(Arrays.toString(arr7));
            }
        }//if (sdvig>0)
    }
    
} //public class MyClass2
