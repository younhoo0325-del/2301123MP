import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfReader;
import com.itextpdf.text.pdf.parser.PdfTextExtractor;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.rendering.PDFRenderer;
import org.apache.pdfbox.text.PDFTextStripper;

import javax.imageio.IIOException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class PDFHandler {

    protected ArrayList<Student> readPDF(String fileName) {
        ArrayList<Student> students = new ArrayList<>();
        try {
            PdfReader reader = new PdfReader(fileName);
            StringBuilder builder = new StringBuilder();
            System.out.printf(reader.getNumberOfPages() + " ");
            for (int i = 1; i < reader.getNumberOfPages(); i++){

                String pageText = PdfTextExtractor.getTextFromPage(reader, i);
                builder.append(pageText).append("\n");
            }
            reader.close();
            makeData(builder.toString(), students);
            if (students.isEmpty()) {
                System.out.println("데이터가 없습니다.");
                System.exit(-1);
            }else {
                System.out.printf("%d개의 데이터를 읽었습니다.\n", students.size());
            }
        } catch (IOException e) {
           System.out.println(e.getMessage());
        }
        return students;
    }

    private void makeData(String text, ArrayList<Student> students) {
        String[]lines = text.split("\\r?\\n");
        for (int i = 0; i < lines.length; i++) {
            String fixedLine =lines[i].replaceAll("^(\\d{7})([가-힣]+)", "$1 $2");
            System.out.println(fixedLine.trim());
            if (fixedLine.matches("^\\d{7}\\s+.*")) {
                String[] tokens = fixedLine.trim().split("\\s+");
                if (tokens.length >= 7) {
                    String studentID = tokens[0];
                    String name = tokens[2];
                    String gender = tokens[3];
                    Student student = new Student(name, gender, studentID);
                    for (int j = 0; j < student.getSubject().size(); j++) {
                    student.getSubject(j).setScore(Integer.parseInt(tokens[j + 3]));
                    }
                    students.add(student);
                }

            }
        }
    }

    public void makePDF(String s, ArrayList<Student> students) {
        Document document = new Document();
        try {
            FileOutputStream outputStream = new FileOutputStream();
        }

    }
}
