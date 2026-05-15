import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class inputHandler {

    public ArrayList<Customer> readData(Flie file) {
        ArrayList<Customer> customers
        try {
            FileReader fileReader = new FileReader(file, StandardCharsets.UTF_8);
            BufferedReader reader = new BufferedReader(fileReader);
            String line;
            while (line = reader.readLine() != null){
                line = line.trim().replaceAll(",", "");
                String[] datas = line.split(" ");
                Customer customer;
                if (datas[0].charAt(0) == '9'){
                    customer = new Special(datas[1], datas[0] , Integer.parseInt(datas[2]));
                }else {
                    customer = new Nomal(datas[1], datas[0] , Integer.parseInt(datas[2]));
                }
                customer.add(customer);
            }
            r
        }catch (IOException e){
            throw  new RuntimeException(e);
        }
    }
}
