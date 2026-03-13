public class ADDress {
    private String dosi;
    private  String city;
    private  String bunji;

    public ADDress(String dosi, String city, String bunji) {
        this.dosi = dosi;
        this.city = city;
        this.bunji = bunji;
    }

    @Override
    public String toString() {
        return String.format("%s %s %s" , dosi , city ,bunji);
    }
}
