public class Book {
    String title;
    String author;
    String translate;
    String publisher;
    int releaseYear;
    int pages;
    int emission;
    String binding;

    Book(String bookTitle, String bookAuthor, String bookTranslate, String bookPublisher, int bookPages, int bookReleaseYear, int bookEmissionn, String bookBinding) {

    this.title = bookTitle;
    this.author = bookAuthor;
    this.publisher = bookPublisher;
    this.translate = bookTranslate;
    this.releaseYear = bookReleaseYear;
    this.pages = bookPages;
    this.emission = bookEmissionn;
    this.binding = bookBinding;
}

    void printInfo (){
        String info = title + " autora " + author + " w tłumaczeniu " + translate + ". Wydany przez " + publisher + pages + " stron." + " Rok wydania " + releaseYear  + ", " + " wydanie " + emission + ", " + " oprawa " + binding;
        System.out.println(info);

    }
}
