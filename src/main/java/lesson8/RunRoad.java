package lesson8;

public class RunRoad {
    private final String name= "Беговая дорожка";
    int lenth;

    public RunRoad(int lenth) {
        this.lenth = lenth;
    }

    public void somebodyRun(String some, int lenth){

        System.out.println(some+" бежит по беговой дорожке "+lenth);


    }

}
