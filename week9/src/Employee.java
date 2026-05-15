public abstract class Employee extends Person implements MyProject, SymbolDefine {
    private String employeeID;

    public Employee(String name, Date birthDay, String employeeID) {
        super(name, birthDay);
        this.employeeID = employeeID;
    }
    public int tax() {
        int tax;
        int temp;
        if (this instanceof Research)
            temp = (int) (gross() - SymbolDefine.RESEARCH);
        else
            temp = gross();
        int taxGross = 0;
        double[] taxRate = new double[0];
        if (taxGross < temp) {
            tax = (int) (temp * taxRate[0] / 100);
        } else if (taxGross < temp)
            tax = (int) (temp * taxRate[1] / 100);
        else
            tax = (int) (temp * taxRate[2] / 100);
        return tax;
    }
    @Override
    public int gross() {
        return salary();
    }
    @Override
    public int net() {
        return gross() - tax();
    }
    protected String employeePrint(int data) {
        return String.format(" %,10d원 %,11d원 %,11d원 %,9d원 %,11d원",
                salary(), data, gross(), tax(), net());
    }
    @Override
    public String toString() {
        return String.format("%7s %s", employeeID, super.toString());
    }
}