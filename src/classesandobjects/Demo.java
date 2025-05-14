package classesandobjects;

import static classesandobjects.Demo.pqr;
public class Demo {

    public int abc = 100; // non static variables;
    public static int pqr = 500; // static variables;

    public void demo1(){
        System.out.println("demo1 non static method");
        abc = 700;
        pqr = 300;
        //both static and non static variables and methods can be used in non static methods
        demo2();
    }
    public static void demo2(){
        System.out.println("demo2 static method");
//        abc = 900 // non static variables and methods cannot be used in static methods
        pqr = 200; //static var can be used
//        demo1();
    }
}
