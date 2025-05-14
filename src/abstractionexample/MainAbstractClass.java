package abstractionexample;

public class MainAbstractClass {
    public static void main(String[] args) {
//        we cannot create object from abstract class directly

        AbstractChildClass abstractChild = new AbstractChildClass();

        abstractChild.demo1();
        abstractChild.demo2();
    }
}
