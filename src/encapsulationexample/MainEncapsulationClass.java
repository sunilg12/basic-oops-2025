package encapsulationexample;

public class MainEncapsulationClass {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();

//        t1.id = 123; wee cannot access private variable directly
//        using setters to assign the values
        t1.setId(101);
        t1.setName("sunil");
        t1.setAge(24);
        t1.setGender("male");
        t1.setQualification("M. pharm");
        t1.setSalary(40000.00);
        System.out.println(t1);
    }
}
