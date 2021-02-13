package school.management.system;

/**
 * We need to declare id => Unique,name,salary.(access modifier)
 */

public class Teacher {
    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * To create a new teacher by initializing
     * @param id id for teacher
     * @param name id for name
     * @param salary id for salary
     */
    public Teacher(int id,String name,int salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned =0;
    }

    /**
     * We want to take id,name and salary so we must use getter mehods
     */

    public int getId(){
        return id; //or this id.
    }
    public String getName(){
        return name;
    }
    public int getSalary(){
        return salary;
    }

    /**
     * We won't change id and name, what we initialize it stayed like that.
     * We need set method for salary because we will change year by year
     */

    public void setSalary(int salary){
        this.salary = salary;
    }


    /**
     * Adds to the salary.
     * Removes from the total money earned by the school.
     * @param salary
     */
    public void receiveSalary(int salary){
        salaryEarned+= salary;
        School.updateTotalMoneySpent(salary);
    }

    @Override
    public String toString() {
        return "Name of the Teacher: " + name + "Total salary earned so far $" + salaryEarned;
    }
}
