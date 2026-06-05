import com.google.zxing.BarcodeFormat;

import java.io.IOException;
import java.util.Scanner;

public static void main(String[] args) throws IOException {
    String data;
    String path = ".\\data\\";
    String fileName = "barcodeEAN.png";
    Scanner keyboard = new Scanner(System.in);
    while (true) {
        System.out.print("BarCode 문자열 입력(숫자 12 자리) : ");
        data = keyboard.next();
        if (data.length() == 12 && data.matches("\\d+"))
            break;
        else {
            System.err.print("12자리 숫자를 입력하세요.");
            System.in.read();
        }
    }
    data = checkDigit(data);
    ZXingHandler handler = new ZXingHandler();
    handler.encoding(data, BarcodeFormat.EAN_13, path + fileName);
}
public static String checkDigit(String data) {
    int sum = 0;
    for (int i = 11; i >= 0; i--) {
        int digit = Character.getNumericValue(data.charAt(i));
        sum += (i % 2 == 0) ? digit : digit * 3;
    }
    int mod = sum % 10;
    int checkDigit = (mod == 0) ? 0 : (10 - mod);
    return data + checkDigit;
}