package classesandobjects;

import static classesandobjects.Demo.pqr;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("Hello World");

//        creating an object of Student class;
        Student s1 = new Student();
        System.out.println("Student1 before assigning the values : " + s1);

        s1.id=101;
        s1.name="Sunil";
        s1.grade="9th grade";
        s1.gender="male";
        s1.address="2-040, abc complex, bombay";
        System.out.println("Student1 after assigning the values : " + s1);

        Demo d1 = new Demo();
        System.out.println("Demo1 " + d1.abc); // non static variables need objects
        System.out.println("demo2 " + Demo.pqr); // static variables doesnt need objects

        d1.demo1(); // non static method calling
        Demo.demo2();// static method calling

        final int aaa = 100;
        int bbb = 300;
        System.out.println(aaa);
        System.out.println(bbb);
//        aaa = 200; cannot change the value of final keyword
        bbb = 800;
        System.out.println(bbb);
    }
}
