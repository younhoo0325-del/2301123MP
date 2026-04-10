public class Water0ffice {
    private Customer[] customers;

    public Water0ffice(Customer[] customers) {
        this.customers = customers;
    }

    protected void inputDate() {
        for (int i = 0; i < customers.length; i++)
            customers[i].inputUasge();

    }

    protected void display() {
        sortBycharge();
        line();
        System.out.println(" 수도번호 이름 구분 사용량 사용금액 세금 남부금액   비고");
        line();
        for (int i = 0; i < customers.length; i++)
            System.out.println(customers[i].toString());
        line();
        System.out.println(total());
        line();
    }

    private String total() {
        return  String.format("%s\n%s\n%s\n%s",
                totalUasge(), totalFee(), totalTax(), toalCharge());

    }

    private String totalUasge() {
       float total = 0.0f;
       for (int i = 0; i < customers.length; i++)
           total += customers[i].usage;


       return String.format("사용량 합계 : %,.2f", total);
    }
    private String totalFee() {
        int total = 0;
        for (int i = 0; i < customers.length; i++)
            total += customers[i].fee();


        return String.format("사용량 금액 합계 : %.d원", total);
    }
    private String totalTax() {
        int total = 0;
        for (int i = 0; i < customers.length; i++)
            total += customers[i].tax();


        return String.format("사용량 세금 합계 : %,d원", total);
    }
    private String totalCharge() {
        int total = 0;
        for (int i = 0; i < customers.length; i++)
            total += customers[i].charge();


        return String.format("사용량  납부금액 : %,d원", total);
    }
}

    private void sortBycharge() {
        Customer temp;
        for (int i = 0; i < customers.length - 1; ++i) {
            for (int j = i + 1; j < customers.length; ++j) {
                if (customers[i].charge() < customers[j].charge()) {
                    temp = customers[i];
                    customers[i] = customers[j];
                    customers[j] = temp;
                }

            }
        }

    private void line() {
        for (int i = 0; i < 60; i++)
            System.out.print("*");
        System.out. println();
    }
}

void main() {
}
