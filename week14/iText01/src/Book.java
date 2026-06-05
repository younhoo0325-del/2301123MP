public class Book {
    private String title;
    private int price;
    private int qty;
    private String isbn;

    // 수량(qty)을 입력하지 않으면 기본값 1로 설정하는 생성자 추가
    public Book(String title, int price, String isbn) {
        this(title, price, 1, isbn);
    }

    public Book(String title, int price, int qty, String isbn) {
        this.title = title;
        this.price = price;
        this.qty = qty;
        this.isbn = isbn;
    }

    public String getTitle() { return title; }
    public int getPrice() { return price; }
    public int getQty() { return qty; }
    public String getIsbn() { return isbn; }
}