
class Student{
    int age;
    String name;
    static String institute;

    void showDetails(){
        System.out.println(age);
        System.out.println(name);
        System.out.println(institute);
    }

    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    public Student(){}


}

public class OOPBasics {
    public static void main(String[] args){

        Student s1 = new Student();
        s1.age = 22;
        s1.name = "Ashu";
        Student.institute = "LTM";
        s1.showDetails();

        Student s2 = new Student(23,"Ashuu");
        s2.showDetails();
    }
}
