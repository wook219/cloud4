package week1;

class Book2{
    public String title;
    public String author;
    public int publicationYear;

    public Book2(String title, String author, int publicationYear){
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    void printDetails(){
        System.out.println("제목 : " + title);
        System.out.println("작가 : " + author);
        System.out.println("출판년도 : " + publicationYear);
    }
}

class AudioBook extends Book2{
    int playTime;

    public AudioBook(String title, String author, int publicationYear, int playTime){
        super(title, author, publicationYear);
        this.playTime = playTime;
    }

    @Override
    void printDetails(){
        System.out.println("제목 : " + super.title);
        System.out.println("작가 : " + super.author);
        System.out.println("작가 : " + super.author);
        System.out.println("재생 시간 : " + playTime);
    }
}

public class Q6 {
    public static void main(String[] args) {
        Book2 book = new Book2("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        AudioBook audiobook = new AudioBook("To Kill a Mockingbird", "Harper Lee", 1960, 745);

        book.printDetails();
        audiobook.printDetails();
    }
}
