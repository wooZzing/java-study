package chapter15;

public class Book {
    String title;
    String author;
    int price;

    // 기본 생성자
    public Book() {
        this.title = "제목 없음";
        this.author = "저자 미상";
        this.price = 0;
        System.out.println("기본 생성자 호출됨");
    }

    // 제목만 받는 생성자
    public Book(String title) {
        this.title = title;
        this.author = "저자 미상";
        this.price = 0;
        System.out.println("제목만 받는 생성자 호출됨");
    }

    // 제목 + 저자 생성자
    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.price = 0;
        System.out.println("제목과 저자를 받는 생성자 호출됨");
    }

    // 제목 + 저자 + 가격 생성자
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("모든 정보를 받는 생성자 호출됨");
    }

    public void printInfo() {
        System.out.println("📘 책 제목: " + title + ", 저자: " + author + ", 가격: " + price + "원");
    }

    public static void main(String[] args) {
        Book b1 = new Book();
        Book b2 = new Book("자바 기초");
        Book b3 = new Book("스프링 입문", "홍길동");
        Book b4 = new Book("데이터베이스", "김철수", 25000);

        b1.printInfo();
        b2.printInfo();
        b3.printInfo();
        b4.printInfo();
    }
}