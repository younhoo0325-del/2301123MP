public class Store {
    private Seller seller;
    private Customer customer;

    public Store(Seller seller, Customer customer) {
        this.seller = seller;
        this.customer = customer;
    }


    public void trade(int count){
        Apple sellerAppler = seller.apple;
        int total = count * sellerAppler.getPrice();

        if (customer.myMoney >= total) {
            if (seller.apple.getInventory() >= count){
                sellerAppler.setInventory(sellerAppler.getInventory() - count);
                if (customer.apple == null){
                    customer.apple = new Apple(sellerAppler.getPrice(), count);

                }else {
                    customer.apple.setInventory(customer.apple.getInventory() + count);
                }
                customer.myMoney -= total;
                seller.myMoney += total;

            }

        }else{
            System.out.println("error : 예산 부족");
        }
        System.out.println(customer);
        System.out.println(seller);
    }
    public void open(){
        System.out.println("과일 가게 오픈");
        System.out.println(seller);
        System.out.println(customer);
    }
}
