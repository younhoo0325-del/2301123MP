public class Person {
    private String name;
    private int height;
    private float weight;
    private Date birthday;
    private  ADDress adDress;

    public Person(String name, int height, float weight, Date birthday , ADDress adDress) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.birthday = birthday;
        this.adDress = adDress;
    }

    @Override
    public String toString() {
        return String.format("%s %dCm, %.1fKg ,%s" + "%s",
                name, height ,weight,birthday,adDress);

    }
}
