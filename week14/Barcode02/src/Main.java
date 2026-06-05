import com.google.zxing.BarcodeFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String data = "";
        String path = ".\\data\\";
        String fileName = "Barcode1239text.png";

        while (true) {
            System.out.print("바코드 문자열 입력 (문자, 숫자): ");
            data = keyboard.nextLine(); // 1. nextLine() 하나만 사용합니다.

            // 2. 공백이거나 비어있지 않은지 올바르게 체크합니다.
            if (data != null && !data.trim().isEmpty()) {
                break;
            }
            System.out.println("⚠️ 올바른 문자열을 입력해주세요.");
        }

        // Scanner 자원 반환
        keyboard.close();

        ZXingHandler handler = new ZXingHandler();
        // 3. 파일명과 경로를 합쳐서 전달합니다.
        handler.encoding(data, BarcodeFormat.CODE_128, path + fileName);
    }
}