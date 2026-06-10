import java.util.Scanner;
class library{
    String[] books;
    int no_of_books;
    library(){
        System.out.println("WELCOME to my library!");
        System.out.println("type 'add book' to add any book.");
        System.out.println("type 'issue book' to isuue any book. ");
        System.out.println("type 'return book' to return any issued book.");
        System.out.println("type 'available book' to get the list of all the available books");
        System.out.println("type 'exit' to exit the library");
        this.books = new String[100];
        this.no_of_books = 0;
    }
    void addBook(String book){
        this.books[no_of_books] = book;
        no_of_books++;
        System.out.println(book + " has been added.");
    }
    void showAvailableBook(){
        System.out.println("Available books are:");
        for(int i=0; i<this.books.length; i++){
            if(this.books[i]==null){
                continue;
            }
            System.out.println("-> " + this.books[i]);
        }
    }
    void issueBook(String book){
        for(int i=0; i<this.books.length; i++){
            if(this.books[i] != null && this.books[i].equalsIgnoreCase(book)){
                System.out.println("This " + book + " has been issued.");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("NO BOOK FOUND!");
    }
    void returnBook(String book){
        this.books[no_of_books] = book;
    }
}
public class onlineLibrary{
    public static void main(String[] args ){
        library lb = new library();
        Scanner sc = new Scanner(System.in);
        
        while(true){
            System.out.println("how would you like to proceed: ");
            String user_ans = sc.nextLine();

            if (user_ans.equalsIgnoreCase("add book")){
                System.out.println("enter the book you want to add : ");
                String bookName = sc.nextLine();
                lb.addBook(bookName);
            }
            else if (user_ans.equalsIgnoreCase("issue book")){
                System.out.println("eneter the book you want to issue: ");
                String bookName = sc.nextLine();
                lb.issueBook(bookName);
            }
            else if (user_ans.equalsIgnoreCase("return book")){
                System.out.println("eneter the book you are returning: ");
                String bookName = sc.nextLine();
                lb.returnBook(bookName);
            }
            else if (user_ans.equalsIgnoreCase("available book")){
                lb.showAvailableBook();
            }
            else if(user_ans.equalsIgnoreCase("exit")){
                System.out.println("thank you!");
                break;
            }
            else{
                System.out.println("i dont understand you!");
            }
        }
    }
}