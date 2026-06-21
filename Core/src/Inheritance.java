class Parent{
    void greet(){
        System.out.println("Hello Hi");
    }

    void goodBye() {
        System.out.println("Good Good Bye");
    }

    int num = 6;
}

class Child extends Parent{

    @Override
    void greet(){
        super.greet();
        System.out.println("Good Morning");
    }


}

public class Inheritance {
    public static void main(String[] args){

        Child obj = new Child();
        obj.greet();
        obj.goodBye();

    }
}
