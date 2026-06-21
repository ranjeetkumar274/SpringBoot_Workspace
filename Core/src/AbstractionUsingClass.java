
abstract class Demo{

    abstract void greet();

    void wish(){
        System.out.println("Hello");
    }
}

class Demo2 extends Demo{

    void greet(){
        super.wish();
        System.out.println("Good Morning");
    }
}

public class AbstractionUsingClass {
    public static void main(String[] args){

        Demo2 obj = new Demo2();
        obj.greet();

    }
}
