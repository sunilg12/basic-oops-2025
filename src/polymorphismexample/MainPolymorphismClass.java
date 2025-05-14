package polymorphismexample;

public class MainPolymorphismClass {
    public static void main(String[] args) {

        PerformSum ps = new PerformSum();

        ps.sum(3,4);
        ps.sum(3,4, 5);
        ps.sum(3.10f,4.02f);
        ps.sum(73.44,56.87);
        ps.sum(8.56f, 43.65);
    }
}
