//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class Main {
    public static void main(String[] args) {
        EleCar eleCar = new EleCar("전기자동차");
        SportCar sportCar = new SportCar("페라리");

        eleCar.charge();
        eleCar.start();
        eleCar.stop();
        sportCar.start();
        sportCar.trubo();
        sportCar.stop();
    }
}