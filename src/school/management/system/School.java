package school.management.system;

import java.util.List;

public class School {
    /** the school can have many teachers, students
     * bc of this we need to use an ArrayList to implement Teachers and Students
     */
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     *creating a new School object & initializing the values
     * @param teachers list of teachers in the school
     * @param students list of students in the school
     */
    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned= 0;
        totalMoneySpent= 0;
    }

    /**
     *
     * @return the list of teachers in the school
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     *
     * @param teacher adding a teachers object to the school
     */
    public void addTeachers(Teacher teacher) {
       teachers.add(teacher);
    }

    /**
     *
     * @return list of students in the school
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     *
     * @param student taking the Arraylist name (students) and using .add()
     */
    public void addStudent (Student student) {
        students.add(student);
    }

    /**
     *
     * @return total money earned by the school
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     *  adds the total money earned by the school to the current amount being earned
     * @param MoneyEarned
     */
    public static void updateTotalMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
    }

    /**
     *
     * @return the total money spent by the school
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     *
     * @param MoneySpent update the money spent by the school on teacher salary
     */

    public static void updateTotalMoneySpent(int MoneySpent) {
        totalMoneyEarned-= MoneySpent;
    }
}
