package school.management.system;

import java.util.List;

/**
 * there many teachers and students in the school.
 * so we use ARRAY LIST to implement the teachers
 * and students.
 */
public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private int totalMoneyEarned;
    private int totalMoneySpent;

    /**
     * Create a new school.
     * @param teachers are teachers in the school
     * @param students are students in the school
     * But initial value of the $MoneyEarned=0,
     *                          $totalMoneySpent=0;
     */

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        this.totalMoneyEarned = 0;
        this.totalMoneySpent = 0;
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
     * @param teacher = add a new teacher to the list
     *
     */

    public void addTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    /**
     *
     * @return the list of student in the school
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     *
     * @param student = add a new student to the list
     *
     */
    public void addStudents(Student student) {
        students.add(student);
    }

    /**
     *
     * @return the total money that earned
     */
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     *
     * @param moneyEarned = amount of money earned right now
     */
    public void updateMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }

    /**
     *
     * @return the amount of money that spent
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     *
     * @param moneySpent = amount of money spent right now
     */
    public void updateTotalMoneySpent(int moneySpent) {
        totalMoneySpent += moneySpent;
    }

    /**
     *
     * @return the money the school is holding, earned minus spent
     */
    public int getBalance() {
        return totalMoneyEarned - totalMoneySpent;
    }
}
