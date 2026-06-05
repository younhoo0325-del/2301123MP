import com.google.zxing.*;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource; // 패키지 임포트 확인
import com.google.zxing.common.HybridBinarizer;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ZXingHandler {

    protected void decoding(File file) {
        MultiFormatReader reader = new MultiFormatReader();


        try (FileInputStream inputStream = new FileInputStream(file)) {
            BufferedImage bufferedImage = ImageIO.read(inputStream);


            LuminanceSource source = new BufferedImageLuminanceSource(bufferedImage);
            HybridBinarizer binarizer = new HybridBinarizer(source);
            BinaryBitmap binaryBitmap = new BinaryBitmap(binarizer);


            Map<DecodeHintType, Object> hintTypeStringMap = new HashMap<>();
            hintTypeStringMap.put(DecodeHintType.CHARACTER_SET, "UTF-8");

            Result result = reader.decode(binaryBitmap, hintTypeStringMap);

            System.out.println("QR code 내용: " + result.getText());

        } catch (NotFoundException e) {
            System.out.println("QR 코드를 판독할 수 없거나 이미지에서 찾지 못했습니다.");
        } catch (IOException e) {
            throw new RuntimeException("파일을 읽는 중 오류가 발생했습니다.", e);
        }
    }
}