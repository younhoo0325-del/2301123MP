public class Navigation {
    protected String model;

    public Navigation(String model) {
        this.model = model;
    }
    public void findRoute(String start, String destination){
        System.out.printf("%s 에서 %S까지 가는 최적의 길을 찾았습니다.\n",
                start , destination);
    }
//gg //
    @Override
    public String toString() {
        return String.format("%s",model);
    }
}
