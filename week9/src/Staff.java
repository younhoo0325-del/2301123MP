public class Staff extends Regular {
    public Staff(String name, Date birthDay, String employeeID, int grade, int step) {
        super(name, birthDay, employeeID, grade, step);
    }
    @Override
    public String toString() {
        return String.format("%s %s", super.toString(), "고정급");
    }
}