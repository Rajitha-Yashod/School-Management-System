package school.management.system;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1,"Lizzy",500);
        Teacher mellisa = new Teacher(2,"Mellisa",700);
        Teacher vanderhorn = new Teacher(3,"Vanderhorn",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(vanderhorn);

        Student tamasha = new Student(1,"Tamasha",4);
        Student rakshith = new Student(2,"Rakshith",12);
        Student rabbi = new Student(3,"Rabbi",5);

        List<Student> studentList =new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(rakshith);
        studentList.add(rabbi);

        School ght=new School(teacherList,studentList);
         rakshith.payFees(4000);
          rabbi.payFees(2000);

        System.out.println("School earned $"+ght.getTotalMoneyEarned());

        lizzy.receivedSalary(lizzy.getSalary());
        System.out.println("Ghs has paid for salary to" +lizzy.getName()+
                "and now ghs has $"+ght.getTotalMoneyEarned());

        vanderhorn.receivedSalary(vanderhorn.getSalary());
        System.out.println("Ghs has paid for salary to" +vanderhorn.getName()+
                "and now ghs has $"+ght.getTotalMoneyEarned());


        //using toString method
        System.out.println("------------to String-----------------");
        System.out.println(rakshith);
        System.out.println(vanderhorn);



    }
}
