public abstract class Regular extends Employee {
    private int grade;
    private int step;
    public Regular(String name, Date birthDay, String employeeID,
                   int grade, int step) {
        super(name, birthDay, employeeID);
        if (isCheck(grade, 1, 5))
            this.grade = grade;
        else
            this.grade = 0;
        if (isCheck(step, 1, 5))
            this.step = step;
        else
            this.step = 0;
    }
    @Override
    public int salary() {
        return salary[grade][step];
    }
    protected String regularPrint(int data) {
        return String.format("%s %d급-%d호 %2d %,7d원 %s",
                super.toString(), grade, step, 0, 0, employeePrint(data));
    }
    @Override
    public String toString() {
        return regularPrint(0);
    }
}