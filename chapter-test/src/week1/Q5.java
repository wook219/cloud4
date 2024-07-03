package week1;

// 여기에 Book클래스를 작성해 주세요.
class Book1{
    private String title;
    private String author;
    private int publicationYear;

    public Book1(String title, String author, int publicationYear){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void printDetails(){
        System.out.println("제목 : " + title);
        System.out.println("작가 : " + author);
        System.out.println("출판년도 : " + publicationYear);
    }
}

public class Q5 {
    public static void main(String[] args) {
        Book1 book = new Book1("The Great Gatsby", "F. Scott Fitzgerald", 1925);

        book.printDetails();
    }
}
