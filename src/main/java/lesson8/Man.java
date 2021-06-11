package lesson8;

public class Man {
    private String name;
    private int maxRun;
    private int maxJump;

    public Man(String name, int maxRun, int maxJump) {
        this.name = name;
        this.maxRun = maxRun;
        this.maxJump = maxJump;
    }

    @Override
    public String toString() {
        return "{Человек name='" + name + '\'' +
                " maxRun='" + maxRun + '\'' +
                " maxJump='" + maxJump + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void run(int lenth){
        actionInt(lenth,maxRun,"бегает");
    }


    public void jump(int lenth) {
        actionInt(lenth,maxJump,"прыгает в высоту");

    }

    public void actionInt(int arg , int maxArg,String action) {
        if (arg>maxArg) {
            System.out.println(name+" "+action+" "+maxArg+" м");

        }else {
            System.out.println(name+" "+action+" "+arg+" м");

        }

    }

}
