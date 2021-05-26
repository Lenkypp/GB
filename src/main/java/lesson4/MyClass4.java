package lesson4;

import java.util.Random;
import java.util.Scanner;

// my Game01 крестики нолики******************************
public class MyClass4 {
        private static int SIZE=3;
        //private static final int DOTS_TO_WIN = 3;
        private static final char DOT_EMPTY = '-';
        private static final char DOT_X = 'X';
        private static final char DOT_O = 'O';
        private static char[][] map;
        private static final Scanner sc = new Scanner(System.in);
        private static final Random rand = new Random();


         public static void main(String[] args) {
            //Запросим ввести размер игрового поля нечетное число (3x3, 5x5, 7x7, 9x9,...)
            SIZE = inpSIZE() ;

            initMap();
            printMap();
            while (true) {
                humanTurn();
                printMap();
                if (isWin(DOT_X)){
                    System.out.println("Вы выиграли, УРА!");
                    break;
                }
                if (isMapFull()){
                    System.out.println("Ничья");
                    break;
                }
                aiTurn();
                printMap();
                if (isWin(DOT_O)){
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
                System.out.print(i + 1 + " ");
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

        private static boolean isWin(char symb) {
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
                        if (summ == SIZE) {
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
                        if (summ == SIZE) {
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
                    if (summ == SIZE) {
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
                    if (summ == SIZE) {
                        return true;
                    }
                }
            }//for (int i = 0; i < SIZE; i++)

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
            //необходимо занять центральную клетку или центральную клетку

            do {
                x = rand.nextInt(SIZE);
                y = rand.nextInt(SIZE);
            } while (isCellInvalid(x, y));
            System.out.printf("Компьютер походил в точку %d %d\n", x + 1, y + 1);
            map[y][x] = DOT_O;
        }

    public static int inpSIZE() {
        //Запросим ввести размер игрового поля нечетное число (3x3, 5x5, 7x7, 9x9,...)
        int x;
        do {
            System.out.println("Введите размер игрового поля - нечетное число:");
            x = sc.nextInt();
         } while (x%2 == 0);

           return x;
    }

}// class