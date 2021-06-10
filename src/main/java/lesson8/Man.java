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
        return "{ Человек"+
                " name='" + name + '\'' +
                " maxRun='" + maxRun + '\'' +
                " maxJump='" + maxJump + '\'' +
                '}';
    }

    public void run(int lenth){
        actionInt(lenth,maxRun,"бегает");
    }

    protected void jump(int height){
        actionInt(height,maxJump,"прыгает в высоту");
    }


    public void actionInt(int arg , int maxArg,String action) {
        if (arg>maxArg) {
            System.out.println("Человек "+ this.name+" " +action+" "+maxArg+" м");

        }else {
            System.out.println("Человек "+ this.name+" "+action+" "+arg+" м");

        }

    }




}
