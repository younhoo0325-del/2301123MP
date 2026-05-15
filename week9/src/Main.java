import java.io.IOException;

public static void main(String[] args) throws IOException {
    Employee[] employees = {
            new Temporary("경복대", new Date(1998, 3, 24), "123456"),
            new Contract("홍길동", new Date(2001, 4, 11), "234567"),
            new Salesman("한송이", new Date(1995, 5, 23), "124567", 1, 4),
            new Manager("한국인", new Date(1988, 7, 20),"345678", 2, 1),
            new Temporary("이대한", new Date(1975, 6, 21), "456213"),
            new Staff("진접읍", new Date(2000, 8, 16), "348967", 3, 3),
            new Salesman("최명길", new Date(1997, 9, 12),"424561", 5, 2),
            new Salesman("정통파", new Date(1994, 11, 5),"124655", 4, 3),
            new Staff("코로나", new Date(1991, 4, 30),"348988", 3, 5),
            new Manager("한민국", new Date(1995, 3, 20), "245778", 2, 4)
    };
    Company company = new Company(employees);
    company.inputData();
    company.display();
}