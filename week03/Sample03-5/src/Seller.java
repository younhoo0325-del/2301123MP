public class Seller {
    protected   Apple apple;
    private  int myMoney;

    public Seller(Apple apple, int myMoney) {
        this.apple = apple;
        this.myMoney = myMoney;
    }

    public boolean sale(int count) {
        boolean flag = true;
        if (this.apple.getInventory() >= count){


        } else {
            System.out.println("error : 재고량 부족 합니다.");
            flag = false;

        }
        return flag;
    }

    @Override
    public String toString() {
        return String.format("판매자 : 현금 : %,d원, 사과 : %,d개 보유",
                myMoney , apple.getInventory() );
    }
}
