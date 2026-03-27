import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Employee {
    private String[] person;
    private Date birthday;
    private  Department department;
    private  Grade grade;
    private int extraPay;


    public Employee(String[] person, Date birthday, Department department, Grade grade) {
        this.person = person;
        this.birthday = birthday;
        this.department = department;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return String.format("%3s%s %4s %3s %2c %,10d원 %,10d원 %,10d원 %,8d원 %,10d원"
        ,person[0], birthday , person[1], department.getDepartName(),Grade.getGrade(), grade.getSalary(),extraPay, groos(), tax(), net());
    }

    public void inputExtrapay() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.printf("%s님의 수당 입력 : ", person[0]);
            extraPay = keyboard.nextInt();
            if (extraPay >= 0 && extraPay <= 1000000) {
                break;
            } else {
                System.out.print("error : 수당오류");
                System.in.read();
            }


        }
    }

}
