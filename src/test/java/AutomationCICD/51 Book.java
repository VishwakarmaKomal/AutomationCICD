package AutomationCICD;

class Book {
    static int totalNoOfBooks;
    String author;
    String title;
    String isbn;
    boolean isBorrowed = false;

    static{
        totalNoOfBooks= 0;
    }
    //Object Init
    {
      totalNoOfBooks++;
    }

    Book(String isbn,String title,String author){
        this.title = title;
        this.isbn = isbn;
        this.author = author;

    }
    Book(String isbn){
        this(isbn,"unknown", "unknown");

    }

    void borrowBook(){
        if(isBorrowed){
            System.out.println("Book is already borrowed");
        }
        else {
            System.out.println("Enjoy " +this.title);
            //totalNoOfBooks--;
            this.isBorrowed = true;
        }
    }

    void returnBook(){
        if(isBorrowed){
            isBorrowed=false;
            System.out.println("Book returned");
        }
        else {
            System.out.println("Book is already present in library");
        }

    }
    static int getTotalNoOfBooks(){
        return totalNoOfBooks;
    }

    public static void main(String arg[]){
        Book programming = new Book("546djg","JAVA", "Komal");
        Book litrature = new Book("534");
        System.out.println(Book.getTotalNoOfBooks());
        programming.borrowBook();
        litrature.borrowBook();
        programming.borrowBook();
        programming.returnBook();
        programming.returnBook();


    }

}
