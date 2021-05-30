package lesson05;

public class Personal {
    private String FIO ;
    private String position ;
    private String email ;
    private String phone ;
    private int salary;
    private int age ;


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

    public String getFIO() {
        return FIO;
    }

    public void setFIO(String FIO) {
        this.FIO = FIO;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}//public class Personal
