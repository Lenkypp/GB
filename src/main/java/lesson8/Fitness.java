package lesson8;

public interface Fitness {

    public int getMaxRun() ;
    public int getMaxJump();


    public default  Boolean run(int lenth,int maxRun,RunRoad runRoad){
       int lenthRunRoad= runRoad.getSize();
       Boolean isRun;
       int maxR =(lenth >= maxRun)? maxRun: lenth ;

       if (maxR>=lenthRunRoad){
           System.out.println("молодец, пробежал на беговой дорожке "+maxR+" м ("+maxR+")");
           isRun =true;
       }else{
           System.out.println(" не смог пробежать длину беговой дорожки "+lenthRunRoad+" м (т.к. всего "+maxR+")");
           isRun = false;
       };
        return isRun;
    }//run

    public  default  Boolean jump(int height, int maxJump, Wall wall){
        int heightWall = wall.getSize();
        Boolean isJump;
        int maxJ =(height >= maxJump )? maxJump : height;
        if (maxJ>=heightWall)  {
            System.out.println("молодец, перепрыгнул стену "+maxJ+" м ("+maxJ+")");
            isJump=  true;
        }else {
                System.out.println(" не смог перепрыгнуть стену "+heightWall+" м ("+maxJ+")");
            isJump=  false;
       };
        return isJump;
    }

}// interface
