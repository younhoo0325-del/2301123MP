public class Manager extends Regular {
    public Manager(String name, Date birthDay, String employeeID,
                   int grade, int step) {
        super(name, birthDay, employeeID, grade, step);
    }
    @Override
    public int gross() {
        return salary() + managerBonus();
    }
    private int managerBonus() {
        int temp;
        int salary = salary();
        if (salary <= manager[0])
            temp = (int) (salary * managerRate[0] / 100);
        else if (salary <= manager[1])
            temp = (int) (salary * managerRate[1] / 100);
        else
            temp = (int) (salary * managerRate[2] / 100);
        return temp;
    }
    @Override
    public String toString() {
        return String.format("%s %s", regularPrint(managerBonus()), "관리수당");
    }
}