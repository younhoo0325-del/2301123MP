import java.io.IOException;

public class PhoneOffice {
    private Customer[] customers;

    public PhoneOffice(Customer[] customers) {
        this.customers = customers;
    }

    protected void intputDate() throws IOException {
        for (int i = 0; i < customers.length; i++){
            customers[i].inputUsageTime();
            customers[i].inputMessage();
        }
    }

    protected void display(){
        line();
        System.out.println("타이틀");
        line();
        for (int i = 0; i < customers.length; i++)
            System.out.println(customers[i]);

    }

    private void line() {
        for (int i = 0; i <100; i++)
            System.out.println("*");
        System.out.println();
    }
}
