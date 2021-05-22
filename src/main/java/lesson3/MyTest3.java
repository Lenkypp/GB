package lesson3;
import java.util.Random;
import java.util.Scanner;

public class MyTest3 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            int nextInt = random.nextInt(9);

            System.out.print(nextInt+", ");

        }

    }
}
