public interface Plan {
    int NETWORK = 3200;
    int BASIC_FEE = 1000;
    int UNIT = 2;
    int[] FEE = {10, 5};
    int[] FREE_MESSAGE = {20, 40};
    int MESSAGE_FEE = 2;
    String getPlanName();
    int calculateFee(Customer customer);