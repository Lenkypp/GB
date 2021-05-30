package lesson05;

public class Personal {
    private String FIO ;
    private String position ;
    private String email ;
    private String phone ;
    private int salary;
    public int age ;


    public Personal(String name, String doljnost,String mail,String phone,int summ,int age) {
        this.FIO = name ;
        this.position = doljnost;
        this.email = mail;
        this.phone = phone;
        this.salary = summ;
        this.age = age;

    }

    public void printInfoEmployee() {

        System.out.println("Информация о сотруднике:");
        System.out.println("ФИО: "+FIO);
        System.out.println("должность: "+position);
        System.out.println("email: "+email);
        System.out.println("телефон: "+phone);
        System.out.println("зарплата: "+salary);
        System.out.println("возраст: "+age);
    }

}
