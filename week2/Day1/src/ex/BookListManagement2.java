package ex;

class Book2 {
    // 지시 사항을 참고하여 코드를 작성해 보세요.
    String title;
    String author;
    int publishYear;
    boolean isAvailable;
}

public class BookListManagement2 {
    public static void main(String[] args) {
        Book2 book = new Book2();
        book.title = "자바의 정석";
        book.author = "남궁성";
        book.publishYear = 2013;
        book.isAvailable = true;

        System.out.println("제목 : " + book.title);
        System.out.println("저자 : " + book.author);
        System.out.println("출판년도 : " + book.publishYear);
        System.out.println("대출 가능 : " + book.isAvailable);
    }
}
