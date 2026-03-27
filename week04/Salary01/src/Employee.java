import java.io.IOException;
import java.util.Scanner;

public class Employee {
    private String name;
    private String employeeID;
    private Date birthday;
    private char departNo;
    private char grade;
    private int extraPay;

    public Employee(String name, String employeeID, Date birthday, char departNo, char grade) {
        this.name = name;
        this.employeeID = employeeID;
        this.birthday = birthday;
        this.departNo = departNo;
        this.grade = grade;
    }

    public void inputExtrapay() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        while (true){
            System.out.printf("%s님의 수당 입력 : ", name);
            extraPay = keyboard.nextInt();
            if (extraPay >= 0 && extraPay <= 1000000){
                break;
            }else {
                System.out.print("error : 수당오류");
                System.in.read();
            }
        }
    }
    private String depart(){
        String result = "";
        switch (departNo){
            case '1' : result = "인사팀";
            break;
            case '2' : result = "재무팀";
                break;
            case '3' : result = "영업팀";
                break;
            case '4' : result = "개발팀";
                break;
            case '5' : result = "생산팀";


        }
        return result;
    }

    private int salary(){
        int gross = 0;
        switch (grade){
            case '1' : gross = 1650000;
                break;
            case '2' : gross = 1680000;
                break;
            case '3' : gross = 1700000;
                break;
            case '4' : gross = 1720000;
                break;
            case '5' : gross = 1750000;


        }
        return gross;
    }

    }




    @Override
    public String toString() {
        return String.format("%3s%s %4s %3s %2c %,10d %,10d %10d",name , birthday ,employeeID,depart(), grade , salary()  );
    }
}




