package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "Lizzy", 500);
        Teacher mellisa = new Teacher(2, "Mellisa", 700);
        Teacher vanderhorn = new Teacher(3, "Vanderhorn", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(vanderhorn);

        Student tamasha = new Student(1, "Tamasha", 4);
        Student rakshith = new Student(2, "Rakshith", 12);
        Student rabbi = new Student(3, "Rabbi", 5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(rakshith);
        studentList.add(rabbi);

        School ghs = new School(teacherList, studentList);

        rakshith.payFees(ghs, 4000);
        rabbi.payFees(ghs, 2000);

        System.out.println("School earned $" + ghs.getTotalMoneyEarned());

        lizzy.receivedSalary(ghs, lizzy.getSalary());
        System.out.println("Ghs has paid salary to " + lizzy.getName()
                + " and now ghs has $" + ghs.getBalance());

        vanderhorn.receivedSalary(ghs, vanderhorn.getSalary());
        System.out.println("Ghs has paid salary to " + vanderhorn.getName()
                + " and now ghs has $" + ghs.getBalance());

        //using toString method
        System.out.println("------------to String-----------------");
        System.out.println(rakshith);
        System.out.println(vanderhorn);
    }
}
