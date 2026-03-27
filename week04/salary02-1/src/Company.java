public class Company {
    private Employee[] employees;

    public Company(Employee[] employees) {
        this.employees = employees;
    }
    protected void inputDate(){
        for (int i = 0; i <employees.length; i++)
            employees[i].inputExtrapay();
    }
    protected void Display(){

    }
}
