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
    private static   int totalMoneyEarned;
    private static int totalMoneySpent;

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
        totalMoneyEarned =0;
        totalMoneySpent =0;
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
     * @param MoneyEarned = new earned money amount
     */
    public static void  updateMoneyEarned(int MoneyEarned) {
        totalMoneyEarned += MoneyEarned;
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
     * @param MoneySpent = spent money amount of now
     */
    public static void updateTotalMoneySpent(int MoneySpent) {
        totalMoneyEarned -= MoneySpent;
    }
}
