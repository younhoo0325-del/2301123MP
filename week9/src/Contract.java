public class Contract extends Employee{
    public Contract(String name, Date birthDay, String employeeID) {
        super(name, birthDay, employeeID);
    }
    @Override
    public int salary() {
        return CONTRACT;
    }
    @Override
    public String toString() {
        return String.format("%s %c급-%c호 %2d %,7d원 %s %s",
                super.toString(), 'X', 'X', 0, 0, employeePrint(0), "계약제");
    }
}
