import java.time.LocalDate;

public class Date {
    private int year;
    private  int month;
    private  int day;

    public Date(int month, int year) {
        this.month = month;
        this.year = year;
    }
    public int getage(){
        int current = LocalDate.now().getYear();

}
    @Override
    public String toString() {
        return String.format("나이 : %d", getage());
    }
}
