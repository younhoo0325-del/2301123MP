import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ZXingHandler {
    public void encoding(String data, BarcodeFormat format, String fileName) {
        try {
            MultiFormatWriter writer = new MultiFormatWriter();
            BitMatrix matrix = writer.encode(data, format, 300, 100);
            Path path = Paths.get(fileName);
            MatrixToImageWriter.writeToPath(matrix, "PNG", path);
            System.out.println("바코드 생성 완료");
        } catch (IOException | WriterException e) {
            System.err.println(e.getMessage());
        }
    }
}