import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;

// 1. 잘못된 Apache POI Path대신 Java 표준 NIO Path를 import해야 합니다.
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class ZXingHandler {
    protected void encoding(String data, BarcodeFormat format, String fileName){
        try {
            MultiFormatWriter writer = new MultiFormatWriter();
            BitMatrix matrix = writer.encode(data, format, 300, 100);
            BufferedImage barcodeImage = MatrixToImageWriter.toBufferedImage(matrix);
            int width = barcodeImage.getWidth();
            int height = barcodeImage.getHeight() + 30;
            BufferedImage finalImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);

            Graphics2D graphics2D = finalImage.createGraphics();
            graphics2D.setColor(Color.WHITE);
            graphics2D.fillRect(0, 0, width, height);
            graphics2D.drawImage(barcodeImage, 0, 0, null);

            graphics2D.setColor(Color.BLACK);
            graphics2D.setFont(new Font("Arial", Font.PLAIN, 16));
            FontMetrics fontMetrics = graphics2D.getFontMetrics();
            int textWidth = fontMetrics.stringWidth(data);
            int x = (width - textWidth) / 2;
            int y = height - 10;
            graphics2D.drawString(data, x, y);
            graphics2D.dispose();

            // 2. 변수명을 path로 통일하거나 복수형(paths)으로 맞추어야 합니다.
            Path path = Paths.get(fileName);
            ImageIO.write(finalImage, "PNG", path.toFile());
            System.out.println("텍스트포함 바코드 생성 완료");

        } catch (WriterException | IOException e) {
            // 3. 에러 메시지를 단순히 호출만 하면 안 되고 출력하거나 로깅해야 합니다.
            e.printStackTrace();
        }
    }
}