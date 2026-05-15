public class Research extends Regular{
    public Research(String name, Date birthDay, String employeeID,
                    int grade, int step) {
        super(name, birthDay, employeeID, grade, step);
    }
    @Override
    public int gross() {
        return salary() + research();
    }
    private int research() {
        return RESEARCH;
    }
    @Override
    public String toString() {
        return String.format("%s %s", regularPrint(research()), "연구수당");
    }
}
