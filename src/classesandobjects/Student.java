package classesandobjects;

public class Student {
    public int id;
    public String name;
    public String gender;
    public String grade;
    public String address;

//  It converts objects to string format;
    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", grade='" + grade + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
