package lesson9;

public class MyArrayDataException extends Exception{

    public MyArrayDataException(int i, int j) {

        System.out.println("Не удалось преобразовать символы в число! ячейка ["+i+"]["+j+"]" );

    }
}
