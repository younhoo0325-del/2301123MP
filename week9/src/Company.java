import java.io.IOException;

public class Company {
    private Employee[] employees;

    public Company(Employee[] employees) {
        this.employees = employees;
    }

    protected void inputData() throws IOException {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof Temporary) {
                ((Temporary) employees[i]).inputData("일용직");
                System.out.println();
            } else if (employees[i] instanceof Salesman) {
                ((Salesman) employees[i]).inputData("영업직");
                System.out.println();
            }
        }
    }

    private void sortByNet() {
        for (int i = 0; i < employees.length - 1; i++) {
            for (int j = 0; j < employees.length - 1 - i; j++) {
                if (employees[j].net() < employees[j + 1].net()) {
                    Employee temp = employees[j];
                    employees[j] = employees[j + 1];
                    employees[j + 1] = temp;
                }
            }
        }
    }
    public void display() {
        sortByNet();
        line(115);
        System.out.println(" 사번 사원명(나이) 직급 일수 일급여 기본급 수당 총급여  세금  실수령액 비고");
                line(115);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        line(115);
        sales();
    }
    private void sales() {
        line(65);
        System.out.println(" 사번 사원명(나이) 직급\t\t\t 영업 금 \t\t 세율 영업수당 ");
                line(65);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] instanceof Salesman) {
                ((Salesman) employees[i]).sales();
            }
        }
        line(65);
    }
    private void line(int size) {
        for (int i = 0; i < size; i++)
            System.out.print("*");
        System.out.println();
    }
}