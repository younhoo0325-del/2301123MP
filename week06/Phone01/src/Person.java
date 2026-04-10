public class Person {
    private String name;
    private Date birthday;


    public Person(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;


    }

    public Date getBirthday() {
        return birthday;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("%4s%s %2d세",
                name,birthday, birthday.getAge());

    }
}
