package school.management.system;

/**
 * this class is responsible for keeping track of teachers' name, id, and salary
 */

public class Teacher {

    private int id;
    private String name;
    private int salary;

    private int salaryEarned;

    /**
     * constructor that creates a new teacher object
     *
     * @param id for the teacher
     * @param name of the teacher
     * @param salary of the teacher
     */
    public Teacher(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }

    /**
     *
     * @return the id for the current teacher
     */
    public int getId(){
        return id;
    }

    /**
     *
     * @return name of the teacher
     */
    public String getName(){
        return this.name;
    }

    /**
     *
     * @return salary of the teacher
     */
    public int getSalary(){
        return salary;
    }

//    we don't want a setter for id nor name, bc they don't change
    public void setSalary(int salary){
        this.salary=salary;
    }

    /**
     * adds to the salary,
     * removes from the total money earned by the school
     * @param salary
     */
    public void receiveSalary(int salary){
salaryEarned+=salary;
School.updateTotalMoneySpent(salary);
    }
    @Override
    public String toString() {
        return  "Name of the teacher: " + name
                +" Total salary earned so far $" +
                salaryEarned;
    }
}
