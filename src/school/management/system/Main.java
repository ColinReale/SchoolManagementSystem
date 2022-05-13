package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher melissa = new Teacher(2, "Melissa", 700);
        Teacher vanderhorn = new Teacher(3, "Vanderhorn", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(melissa);


    Student tamasha = new Student(1, "Tamasha", 4);
    Student rakshith = new Student (2, "Rakshith", 12);
    Student rabbi = new Student(3, "Rabbi", 5);
    List<Student> studentList = new ArrayList<>();
    studentList.add(tamasha);
    studentList.add(rabbi);
    studentList.add(rakshith);



    School ghs = new School(teacherList, studentList);



        tamasha.payFees(5000);
        rakshith.payFees(6000);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());

        System.out.println("-----Making GHS PAY SALARY-----");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has paid to " + lizzy.getName() + " and now has $" + ghs.getTotalMoneyEarned());

        vanderhorn.receiveSalary(vanderhorn.getSalary());
        System.out.println("GHS has paid to " + vanderhorn.getName() + " and now has $" + ghs.getTotalMoneyEarned());

        System.out.println(rakshith);
        melissa.receiveSalary(melissa.getSalary());
        System.out.println(melissa);
    }
}
