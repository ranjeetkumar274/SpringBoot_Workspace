interface ISongs{
    int num = 5;
    void sing();
}

class Pop implements ISongs{

    @Override
    public void sing(){
        int x = num;
        System.out.println("kjhakhkjhkjdh " + x);
    }
}

interface IMelody extends ISongs{

    default void sing(){}
}


public class Interfaces extends Object{
    public static void main(String... args){

        Pop p = new Pop();
        p.sing();

    }
}
