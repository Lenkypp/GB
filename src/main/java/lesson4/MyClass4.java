package lesson4;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

// my Game01 крестики нолики******************************

//===Домашнее задание урок 5===
//Переделать проверку победы, чтобы она не была реализована просто набором условий,
// например, с использованием циклов.
//* Попробовать переписать логику проверки победы, чтобы она работала
// для поля 5х5 и количества фишек 4.
// Очень желательно не делать это просто набором условий для каждой из возможных ситуаций;
// *** Доработать искусственный интеллект, чтобы он мог блокировать ходы игрока.

public class MyClass4 {
        private static int SIZE;

        //количество в ряд 'X' или '0' для победы (для размеров поля больше 3)
        private static int DOTS_TO_WIN;

        private static final char DOT_EMPTY = '-';
        private static final char DOT_X = 'X';
        private static final char DOT_O = 'O';
        private static char[][] map;
        private static final Scanner sc = new Scanner(System.in);
        private static final Random rand = new Random();
        private static int[][] MAP_X;
        private static int SUM_DANGER;




         public static void main(String[] args) {
            //Запросим ввести размер игрового поля (3x3, 5x5, 7x7, 9x9,...)
            SIZE = inpSIZE() ;
            if (SIZE==3){
                DOTS_TO_WIN = 3;
             }else{
                DOTS_TO_WIN =  inpDOTS() ;
            }
             MAP_X = new int[SIZE][SIZE];
            if (SIZE-DOTS_TO_WIN>=2 ) {
                SUM_DANGER=SIZE - (SIZE - DOTS_TO_WIN) - 1;
            }else{
                SUM_DANGER = SIZE-1;
            }

             System.out.println(SUM_DANGER);

            initMap();
            printMap();
            while (true) {
                humanTurn();
                printMap();
                if (isWin(DOT_X,DOTS_TO_WIN)){
                    System.out.println("Вы выиграли, УРА!");
                    break;
                }
                if (isMapFull()){
                    System.out.println("Ничья");
                    break;
                }
                aiTurn();
                printMap();
                if (isWin(DOT_O, DOTS_TO_WIN)){
                    System.out.println("Выиграл искусственный интеллект, увы...");
                    break;
                }
                if (isMapFull()){
                    System.out.println("Ничья");
                    break;
                }
            }
            System.out.println("Игра окончена");
        }

        private static void initMap() {
            map = new char[SIZE][SIZE];
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    map[i][j] = DOT_EMPTY;
                }
            }
        }

        private static void printMap() {
            for (int i = 0; i <= SIZE; i++) {
                System.out.print(i + "  ");
            }
            System.out.println();
            for (int i = 0; i < SIZE; i++) {
                System.out.print(i + 1 + "  ");
                for (int j = 0; j < SIZE; j++) {
                    System.out.print(map[i][j]+"  ");
                }
                System.out.println();
            }
            System.out.println();
        }

        private static void humanTurn() {
            int x, y;
            do {
                System.out.println("Введите координату по вертикали");
                x = sc.nextInt() - 1;
                System.out.println("Введите координату по горизонтали");
                y = sc.nextInt() - 1;
            } while (isCellInvalid(x, y));
            map[y][x] = DOT_X;
        }

        private static boolean isCellInvalid(int x, int y) {
            return (x < 0 || x >= SIZE)
                    || (y < 0 || y >= SIZE)
                    || map[y][x] != DOT_EMPTY;
        }

        private static boolean isWin(char symb,int predel) {
            int[][] arrCheck = new int[SIZE][SIZE];
            int summ =0;
            // замена и проверка сумм по горизонтали ==============================
            for (int i = 0; i < SIZE; i++) {
                summ = 0;
                for (int j = 0; j < SIZE; j++) {
                    if (map[i][j] == symb) {
                        arrCheck[i][j] = 1; // присвоим 1 на адрес вместо X или 0
                        summ = summ + 1;
                        //если сумма единиц = SIZE  тогда победа
                        if (summ == predel) {
                            return true;
                        }
                    }
                }
            }//for (int i = 0; i < SIZE; i++)

            // проверка по вертикали  =======================================
            for (int j = 0; j < SIZE; j++) {
                summ = 0;
                for (int i = 0; i < SIZE; i++) {
                    if (map[i][j] == symb) {
                        arrCheck[i][j] = 1; // присвоим 1 на адрес вместо X или 0
                        summ = summ + 1;
                        //если сумма единиц = SIZE  тогда победа
                        if (summ == predel) {
                            return true;
                        }
                    }
                }
            }// for (int j = 0; j < SIZE; j++)

           // проверка по 1-ой диагонали  =======================================
            summ = 0;
            for (int i = 0; i < SIZE; i++) {
                 if (map[i][i] == symb) {
                    arrCheck[i][i] = 1; // присвоим 1 на адрес вместо X или 0
                    summ = summ + 1;
                    //если сумма единиц = SIZE  тогда победа
                    if (summ == predel) {
                        return true;
                    }
                }
            }//for (int i = 0; i < SIZE; i++)

            // проверка по 2-ой диагонали  =======================================
            summ = 0;
            for (int i = 0; i < SIZE; i++) {
                 if (map[i][SIZE-1-i] == symb) {
                    arrCheck[i][SIZE-1-i] = 1; // присвоим 1 на адрес вместо X или 0
                    summ = summ + 1;
                    //если сумма единиц = SIZE  тогда победа
                    if (summ == predel) {
                        return true;
                    }
                }
            }//for (int i = 0; i < SIZE; i++)
            if (symb == DOT_X){
                 MAP_X = arrCheck;
            }
            return false;
            } //isWin(

        private static boolean isMapFull() {
            for (int i = 0; i < SIZE; i++) {
                for (int j = 0; j < SIZE; j++) {
                    if (map[i][j] == DOT_EMPTY) {
                        return false;
                    }
                }
            }
            return true;
        }

        private static void aiTurn() {
            int x, y;
            int sum_goriz=0; // сумма по горизонтали
            int sum_vert=0;// сумма по вертикали
            int maxElem =0;
            int sumDanger = SIZE - (SIZE-DOTS_TO_WIN);

            // если DOTS_TO_WIN == SIZE, тогда
            //проверим на опасную позицию : количество X в ряд = DOTS_TO_WIN - 1
            int[][] arrChek01 = new int[SIZE+2][SIZE+2];
            for (int i = 0; i < SIZE; i++) {
                arrChek01[i][SIZE] = sum_goriz;

                sum_goriz=0;
                for (int j = 0; j < SIZE; j++) {
                    arrChek01[i][j] = MAP_X[i][j];
                    sum_goriz = sum_goriz + arrChek01[i][j];
                    if (sum_goriz == sumDanger){
                        x = i; y = j;

                    }
                }
            }

            for (int j = 0; j < SIZE; j++) {
                arrChek01[SIZE][j] = sum_vert;
                sum_vert=0;
                for (int i = 0; i < SIZE; i++) {
                    sum_vert = sum_vert + arrChek01[i][j];

                }
            }


              System.out.println("максимальный элемент гор= "+ maxElem);
//            System.out.println("минимальный элемент верт= "+ maxvert);

            // если DOTS_TO_WIN == SIZE, тогда
         //проверим на опасную позицию количество X в ряд = DOTS_TO_WIN - 1


         // если DOTS_TO_WIN < SIZE , тогда
         // проверим на опасную позицию количество X в ряд = DOTS_TO_WIN - (SIZE -DOTS_TO_WIN)

         //если есть опасная позиция - перекрыть поставив 0

         //необходимо занять центральную клетку, т.к. там больше ваориантов

         //занимать открытые вертикали и горизонтали
            do {
                x = rand.nextInt(SIZE);
                y = rand.nextInt(SIZE);
            } while (isCellInvalid(x, y));
            System.out.printf("Компьютер походил в точку %d %d\n", x + 1, y + 1);
            map[y][x] = DOT_O;
        }

    public static int inpSIZE() {
        //Запросим ввести размер игрового поля целое число (3x3, 5x5, 7x7, 9x9,...)
        int x;
        do {
            System.out.println("Введите размер игрового поля - целое число:");
            x = sc.nextInt();
         } while (x<3);

           return x;
    }

    public static int inpDOTS(){
        //Запросим ввести количество фишек
        int x;
        do {
            System.out.println("Введите количество фишек:");
            x = sc.nextInt();
        } while ( x <3 || x > SIZE);

        return x;

    }

}// class