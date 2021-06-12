package lesson8;

public interface Fitness {
    public int lenthRunRoad=9000;
    public int heightWall = 2;

    public default  Boolean run(int lenth,int maxRun){
       Boolean isRun;
       int maxR =(lenth > maxRun)? maxRun: lenth ;

       if (maxR>=lenthRunRoad){
           System.out.println("молодец, пробежал на беговой дорожке "+maxR+" м ("+maxR+")");
           isRun =true;
       }else{
           System.out.println(" не смог пробежать длину беговой дорожки "+lenthRunRoad+" м (т.к. всего "+maxR+")");
           isRun = false;
       };
        return isRun;
    }//run

    public  default  Boolean jump(int height, int maxJump){
        Boolean isJump;
        int maxJ =(height > maxJump )? maxJump : height;
        if (maxJ>=heightWall)  {
            System.out.println("молодец, перепрыгнул стену "+maxJ+" м ("+maxJump+")");
            isJump=  true;
        }else {
                System.out.println(" не смог перепрыгнуть стену "+heightWall+" м ("+maxJump+")");
            isJump=  false;
       };
        return isJump;
    }

}// interface