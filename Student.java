package school.management.system;

public class Student {

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /**
     * When create a new student object, we wat to
     * add id, name, grade. further total fees for year
     * is constant(30000 bucks). inizial paid fees is 0;
     * @param id = id of the student
     * @param name = name of the student
     * @param grade = grage of the student
     */

    public Student(int id,String name,int grade){
        this.id=id;
        this.name=name;
        this.grade=grade;
        feesTotal=30000;
        feesPaid=0;
    }

    /**
     * we uses SET methods to update invidual feild in created object.
     * so we don't want to update student name and id. we only want update
     * grade by year to year and Paid fees when student pay money.
     * @param grade =new grade of the student
     */

    public void setGrade(int grade){
        this.grade=grade;
    }

    /**
     *
     * @param fees = fees that the student is pay now.
     */
    public void payFees(int fees){
        feesPaid += fees;
        School.updateMoneyEarned(feesPaid);

    }

    /**
     *
     * @return the id of the student
     */

    public int getId() {
        return id;
    }

    /**
     *
     * @return the name of the student
     */

    public String getName() {
        return name;
    }

    /**
     *
     * @return the grade of the student
     */

    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return the fees of paid by the student
     */

    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return total fees of the year for the student
     */

    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return the remaining fees of the Student for year
     */
    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }

    @Override
    public String toString() {
        return "Student's name :"+name+
                " Total fees paid so far $"+ feesPaid;
    }
}
