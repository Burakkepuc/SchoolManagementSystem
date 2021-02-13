package school.management.system;

/**
 * We need Id=>Unique,Name,Grade,Fees supposed to be paid, fees total.
 */
public class Student {

    private String name;
    private int id;
    private int grade;
    private int feesTotal;
    private int feesPaid;

    /**
     * To create a new student by initialiing.
     * Fees for everystudent if $30.000;
     * Fees paid initially 0.
     *
     * @param id    id for student : unique
     * @param grade grade of the wstudent
     * @param name  name of the student.
     */
    public Student(int id, String name, int grade) {
        feesTotal = 30000;
        feesPaid = 0;
        this.name = name;
        this.id = id;
        if (grade <= 5)
            this.grade = grade;
        else
            System.out.println("Wrong!");
    }

    /**
     * We won't alter the student's name,studen's id so we don't have setter methods.
     */

    /**
     * Used to update student's grade.
     *
     * @param grade new grade of the student.
     */
    public void setGrade(int grade) { //We will access it from main class so have to be public.(Access modifier)
        this.grade += grade;
    }

    /**
     * Keep adding the fees to feesPaid field.
     * Add the fees to the fees paid
     * The school is going to receive the funds
     *
     * @param fees : the fees that the student pays
     */
    public void payFees(int fees) {
        feesPaid += fees;
        School.updateTotalMoneyEarned(feesPaid);
    }

    /**
     * @return name for students
     */
    public String getName() {
        return name;
    }

    /**
     * @return id for students
     */

    public int getId() {
        return id;
    }

    /**
     * @return grade for students
     */

    public int getGrade() {
        return grade;
    }

    /**
     * @return total fees for students
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     * @return paid fees for students
     */

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getRemainingFees() {
        return feesTotal -= feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name: " +name+"total fees paid so far $" + feesPaid;
    }
}

