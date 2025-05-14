package polymorphismexample;

public class PerformSum {

    public void sum(int a, int b){
        System.out.println("Sum of a and b "+ (a+b));
    }

    public void sum(int a, int b, int c){
        System.out.println("Sum of 3 integers "+ (a+b+c));
    }

    public void sum(float a, float b){
        System.out.println("Sum of float "+ (a+b));
    }

    public void sum(double a, double b){
        System.out.println("Sum of float "+ (a+b));
    }

    public void sum(float a, double b){
        System.out.println("Sum of float "+ (a+b));
    }

//    etc
}
