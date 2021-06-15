package lesson9;

public class MyArrayDataException extends Exception{

    public MyArrayDataException(int i, int j) {

        System.out.println("Ошибка приведения типов! ячейка ["+i+"]["+j+"]" );

    }
}
