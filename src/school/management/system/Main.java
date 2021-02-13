package school.management.system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1,"Lizzy",500);
        Teacher melissa = new Teacher(2,"Melissa",700);
        Teacher vanderhan = new Teacher(3,"Vanderhorn",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(melissa);
        teacherList.add(vanderhan);

        Student tamasha = new Student(1,"Tamasha",4);
        Student rakshith = new Student(2,"Rakshith Vasudev",2); //If I gave it bigger than 5 It returns "wrong" because I gave if-else condition
        Student burak = new Student(3,"Burak Kepuc",5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(rakshith);
        studentList.add(burak);

        School ghs = new School(studentList,teacherList);

        Teacher megan = new Teacher(6,"Megan",900);
        ghs.addTeacher(megan);

        burak.payFees(5000);
        tamasha.payFees(6000);
        System.out.println("GHS has earned $"+ghs.getTotalMoneyEarned());

        System.out.println("-------------Making  SCHOOL PAY SALARY------------");
        lizzy.receiveSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to " + lizzy.getName()
        +"and now has $" + ghs.getTotalMoneyEarned()
        );

        vanderhan.receiveSalary(vanderhan.getSalary());
        System.out.println("GHS has spent for salary to " + vanderhan.getName()
                +"and now has $" + ghs.getTotalMoneyEarned()
        );

        System.out.println(burak);
        System.out.println(lizzy);
    }
}
