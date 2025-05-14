package interfaceexample;

public class SampleClass implements SampleInterface2, SampleInterface{

    @Override
    public void demo1() {
        System.out.println("Demo1 implementation in child class");
        System.out.println("variable : " + SampleInterface.abc);
    }

    @Override
    public void demo2() {
        System.out.println("Demo2 implementation in child class");
    }

    @Override
    public void demo3() {
        System.out.println("Demo3 implementation in child class");
    }

    @Override
    public void demo4() {
        System.out.println("Demo4 implementation in child class");
    }

    @Override
    public void demo5() {
        System.out.println("Demo5 implementation in child class of first interface preference");
    }
}
