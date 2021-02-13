package school.management.system;

import java.util.List;

/**
 * We need to list of teacher and student and we don't know what's the number of them.(We can't use array)
 * We need List for it.
 * Teachers-Students-total money earned-total money spent.
 */
public class School {
    private List<Student> students;
    private List<Teacher> teachers;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     * To create new School by initializing.
     * @param student to create students
     * @param teacher to create teachers
     */
    public School(List<Student> student,List<Teacher> teacher){ //We will pass as arraylist(declaration name) respectively
        this.students = student;
        this.teachers = teacher;
        totalMoneySpent = 0;
    }

    /**
     * Adds a teacher to the school
     * @param teacher
     */
    public void addTeacher(Teacher teacher){
        teachers.add(teacher);
    }

    /**
     *
     * @return the list of teachers in the school
     */
    public List<Teacher> getTeachers(){
        return teachers;
    }

    /**
     * Add a student to the school
     * @param student
     */
    public void addStudent(Student student){
        students.add(student);
    }

    /**
     *
     * @return the list of students in the school.
     */
    public List<Student> getStudents(){
        return students;
    }

    /**
     * Update the total money earned by the school
     * @param totalMoneyEarned1 money that is supposed to be added.
     */
    public static void  updateTotalMoneyEarned(int totalMoneyEarned1){
        totalMoneyEarned += totalMoneyEarned1;
    }

    /**
     *
     * @return the total money that earned by the school
     */
    public int getTotalMoneyEarned(){
        return totalMoneyEarned;
    }

    /**
     * Update the money that is spent by the school
     * @param totalMoneySpent1 the money that is spent
     */
    public static void updateTotalMoneySpent(int totalMoneySpent1){
        totalMoneyEarned -= totalMoneySpent1;
    }

    /**
     *
     * @return the total money spent by the school which
     * is the salary given by the school its teachers
     */
    public int getTotalMoneySpent(){
        return this.totalMoneySpent;
    }

}
