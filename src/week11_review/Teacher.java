package week11_review;

public class Teacher extends Employee {

    public Teacher(String name, int age, char gender, String employeeId, double salary) {
        super(name, age, gender, employeeId, "Teacher", salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is teaching");
    }
}
