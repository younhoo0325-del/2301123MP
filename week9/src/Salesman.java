import java.io.IOException;
import java.util.Scanner;

public class Salesman extends Regular {
    private int sales;
    private double commission;
    public Salesman(String name, Date birthDay, String employeeID,
                    int grade, int step) {
        super(name, birthDay, employeeID, grade, step);
        this.sales = 0;
        this.commission = 0.0;
    }
    public int getSales() {
        return sales;
    }
    public double getCommission() {
        return commission;
    }
    protected void inputData() throws IOException {
        Scanner keyboard = new Scanner(System.in);
        inputSales(keyboard);
        inputCommission(keyboard);
    }
    private void inputSales(Scanner keyboard) throws IOException {
        while (true) {
            System.out.printf("[%s] %s님의 판매금액 입력 : ", "영업직", super.getName());
            try {
                sales = keyboard.nextInt();
                if (sales >= 0)
                    break;
                else
                    error("판매금액은 음수일 수 없습니다.");
            } catch (Exception e) {
                error("유효한 숫자를 입력해주세요.");
            }
        }
    }
    private void inputCommission(Scanner keyboard) throws IOException {
        while (true) {
            System.out.printf("[%s] %s님의 수당 비율 입력 : ", "영업직",
                    super.getName());
            try {
                commission = keyboard.nextDouble();
                if (isValid2(commission))
                    break;
                else
                    error(keyboard, "수당 비율이 음수일 수 없습니다.");
            } catch (Exception e) {
                error(keyboard, "유효한 숫자를 입력해주세요.");
            }
        }
    }
    @Override
    public int gross() {
        return salary() + commission();
    }
    private int commission() {
        return (int) (sales * commission / 100);
    }
    @Override
    public String toString() {
        return String.format("%s %s", regularPrint(commission()), "영업수당");
    }
    protected void sales() {
        System.out.printf("%s %,13d원 %4.1f%% %,10d원\n",
                super.toString().substring(0, 22),
                getSales(), getCommission(), commission());
    }
}