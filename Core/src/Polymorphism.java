
class People{
    void profession(){
        System.out.println("Enginner");
    }
}

class Student1 extends People{

    @Override
    void profession(){
        System.out.println("Studentt");
    }

    void profession(int age){
        if(age > 65){
            System.out.println("Retired");
        }
        else {
            System.out.println("Working");
        }
    }
}


public class Polymorphism {
    public static void main(String[] args){

        People std = new Student1();
        std.profession();
        Student1 std1 = new Student1();
        std1.profession(45);
    }
}
