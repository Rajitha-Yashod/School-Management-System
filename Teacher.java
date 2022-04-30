package school.management.system;

public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    /**
     * create new Teacher object
     * @param id = id of the teacher
     * @param name = name of the teacher
     * @param salary = salary of the teacher
     */

    public Teacher(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
    }

    /**
     * update teacher's info. But id and name
     * are never change. so we want only one SET method.
     * @param salary = new salary of the teacher
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }

    /**
     *
     * @return the id of the teacher
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return the name of the teacher
     */

    public String getName() {
        return name;
    }

    /**
     *
     * @return the salary of the teacher
     */

    public int getSalary() {
        return salary;
    }

    public void receivedSalary(int salary){
        salaryEarned+= salary;
        School.updateTotalMoneySpent(salaryEarned);

    }

    @Override
    public String toString() {
        return "Name of the Teacher:" +name
                +" Total salary earned so far $"
                + salaryEarned;
    }
}


