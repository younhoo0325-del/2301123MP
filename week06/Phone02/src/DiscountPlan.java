public class DiscountPlan extends Plan{
    public DiscountPlan() {
        super("할인 요금제");
    }

    protected int calculateFee(Customer customer) {
        int callFee = (customer.getUsageTime() / 2 +
                customer.getUsageTime() % 2 != 0 ? 1 : 0) * 5;
        int magFee = 0;
        if (isold( customer.getBirthday().getAge())) {
            magFee = (customer.getMessage() - 40) * 2;
        }
        return  BASIC + callFee + magFee;

    }

}

