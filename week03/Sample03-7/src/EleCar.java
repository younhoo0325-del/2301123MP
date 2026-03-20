public class EleCar extends Car{

    public EleCar(String model) {
        super(model);
    }
    public void charge() {
        System.out.println(model + "가 충전 중입니다." );
    }

    @Override
    public String toString() {
        return String.format("%s", model);
    }
}
