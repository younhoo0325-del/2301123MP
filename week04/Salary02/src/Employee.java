import java.io.IOException;
import java.util.Scanner;

public class Employee {
    private String name;
    private String employeeId;
    private Date birthday;
    private Department department;
    private Grade grade;
    private int extraPay;


    public Employee(String name, String employeeId, Date birthday, Department department, Grade grade) {
        this.name = name;
        this.employeeId = employeeId;
        this.birthday = birthday;
        this.department = department;
        this.grade = grade;
    }

    public void inputExtrapay() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.printf("%s님의 수당 입력 : ", name);
            extraPay = keyboard.nextInt();
            if (extraPay >= 0 && extraPay <= 1000000) {
                break;
            } else {
                System.out.print("error : 수당오류");
                System.in.read();
            }


        }
    }

    private int gross(){
        return grade.getSalary();
    }

    private int tax() {
        return 0;
    }
    protected int payment() {
        return gross() + extraPay - tax();
    }
    @Override
    public String toString() {
        return String.format("%3s%s %4s %3s %2c %,10원 %,10원 %,10d원 %,8d원 %,10d원",
                name ,birthday.toString(),employeeId
                ,department.getDepartName(),grade.getGrade(), grade.getSalary(),extraPay,gross(), tax(),net());
    }

    public int net() {
    }
}