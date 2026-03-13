public class peson {
    // state 상태
    private String name;
    private  int age;
    private  boolean gender; //true// -남 + 여
    private  boolean isMaried;
    private  int children;

    //생성자 shift 클릭시 다수 선택 가능

    // 아래 순서대로 0개 1개 다수 선택
    public peson() {
    }

    public peson(String name) {
        this.name = name;
    }

    public peson(String name, int age, boolean gender, boolean isMaried, int children) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.isMaried = isMaried;
        this.children = children;
    }

    //Method 생성누르고 getter

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getChildren() {
        return children;
    }

    public void setChildren(int children) {
        this.children = children;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public boolean isMaried() {
        return isMaried;
    }

    public void setMaried(boolean maried) {
        isMaried = maried;
    }
    //toString 생성
    @Override
    public String toString() {
        String type = gender ? "남자" : "여자";
        return String.format("나이는 %d , 이름은 %s %s가 있음 \n" + "");
        return "peson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", isMaried=" + isMaried +
                ", children=" + children +
                '}';
    }
}
