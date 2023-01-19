package week11_review;

public class Tester extends Employee{ // Tester is an employee


    public Tester(String name, int age, char gender, String employeeId, String jobTitle, double salary) {
        super(name, age, gender, employeeId, jobTitle, salary);
    }

    public void smokeTesting(){
        System.out.println(getJobTitle() + " "+ getName() + " is smoke testing");
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " "+ getName() + " is findings bugs" );
    }

}
