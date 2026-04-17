import java.io.IOException;
import java.util.Scanner;

public class Part implements MyProject {
    private String partName;
    private int score;


    public Part(String partName) {
        this.partName = partName;
        this.score = 0;
    }

    public int getScore() {
        return score;
    }

    public String getPartName() {
        return partName;
    }

    protected void inputDate(String name) throws IOException {
        Scanner keyboard = new Scanner(System.in);
        while (true) {
            System.out.printf("%s님 %s 성적 입력 :",name,partName);
            score = keyboard.nextInt();
            if (partName.equals("출석")){
                if (isvalid1(score))
                    break;

            }else {
                if (isvalid(score))
                    break;
                else {
                    error("error 성적 ");

                }

            }
        }
    }

    public void inputData(String name) {
    }
}
