public class Library {
    public static void main (String []args ){

     Book book1 = new Book ("Mroczna wieżą III", "Stephen King", "Zbiegniew Królicki", "Albatros", 559, 2017, 9, "miękka");
     Book book2 = new Book("Ketoza. Wejdź na wyzszy poziom", "Dawid Dobrowolski", "brak",
                "Dobrowolski", 297,2017, 1, "miekka");
     Book book3= new Book ("Księga dżungli", "Rudyard Kipling", "Franciszek Mirandola", "Belllona", 217, 2015, 0, "twarda");
     Book book4 = new Book ("Nie kończąca się historia", "Michael Ende", "Sławomir Błaut", "Siedmioróg", 480, 2001,0, "twarda");

        System.out.println("W biblioteece znajdują się następujące książki: ");
        book1.printInfo();
        book2.printInfo();
        book3.printInfo();
        book4.printInfo();
    }

}
