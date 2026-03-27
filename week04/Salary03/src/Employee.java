import java.io.IOException;
import java.util.Scanner;

public class Employee extends Person{
    private String employeeID;
    private Department department;
    private Grade grade;
    private int extraPay;


    public Employee(String name, Date birthday, String employeeID, Department department, Grade grade) {
        super(name, birthday);
        this.employeeID = employeeID;
        this.department = department;
        this.grade = grade;

    }



}public void inputExtrapay() throws IOException {
    Scanner keyboard = new Scanner(System.in);
    while (true) {
        System.out.printf("%s님의 수당 입력 : ", super.getName());
        int extraPay = keyboard.nextInt();
        if (extraPay >= 0 && extraPay <= 1000000) {
            break;
        } else {
            System.out.print("error : 수당오류");
            System.in.read();
        }



    }
}

@Override
public String toString() {
   return super.toString() + String.format("%4s %3s %2c %,10원 %,10원 %,10원 %,8원 %,10원",
           , )
}

void main() {
}
