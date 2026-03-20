public class Customer {
    protected Apple apple;
    protected  int myMoney;

    public Customer(Apple apple, int myMoney) {
        this.apple = null;
        this.myMoney = myMoney;
    }

    private void buy(Seller seller, Apple apple, int count) {
        int total = count * apple.getPrice();
        if (myMoney >= total) {
            if (seller.sale(count)){
                if (this.apple == null){
                    this.apple = new Apple(apple.getPrice(), count);
                }else {
                    apple.setInventory(apple.getInventory() + count);
                }

               myMoney -= total;
            }else {
                System.out.println("error : 판매자의 재고가 부족");
            }

        }else {
            System.out.println("error : 돈 없음");
        }
        System.out.println(this);
        System.out.println(seller);


    }

    @Override
    public String toString() {
        String result = "";
        if (apple == null){
            result = ("고객 : 현금 : %,d원, 사과 : 0개",myMoney);
        }else {
            result = String.format("고객 : 현금 : %,d원 :사과 : %,d개",
                    myMoney, apple.getInventory());
        }

        return result;
    }

}
