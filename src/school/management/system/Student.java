package school.management.system;
//This class is going to track the students' name, fees, grade and feeds paid
public class Student {
//    specifying private variables because you want to protect someone from outside the student class from accessing this id

    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    /** to create a new student by initializing
     * fees for every student is $30,000/year
     * fees paid initially is 0
     * @param id
     * @param name
     * @param grade
     */
    public Student(int id, String name, int grade) {
        this.feesPaid=0;
        this.feesTotal=30000;
        this.id=id;
        this.name=name;
        this.grade=grade;


    }
//only using setGrade bc I am not going to change/alter id or name
        public void setGrade(int grade){
        this.grade=grade;
    }

    /**
     * feespaid = 10000 + 5000 + 15000. our update method should keep adding the fees too feespaid field
     * add the fees to the fees paid.
     * the school is going to receive the funds
     *
     * @param fees the fees that the student pays
     */
    public void payFees(int fees){
        feesPaid+=fees;
        School.updateTotalMoneyEarned(feesPaid);

    }

    /**
     *
     * @return id of the student
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @return name of the student
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return grade (class) of the student
     */
    public int getGrade() {
        return grade;
    }

    /**
     *
     * @return fees paid by the student
     */
    public int getFeesPaid() {
        return feesPaid;
    }

    /**
     *
     * @return total fees paid by student
     */
    public int getFeesTotal() {
        return feesTotal;
    }

    /**
     *
     * @return the remaining fees
     */
    public int getRemainingFees(){
        return feesTotal-feesPaid;
    }
    @Override
    public String toString() {
        return "Student's name: "+name+
                " Total fees paid so far: "+getFeesPaid();
    }

}
