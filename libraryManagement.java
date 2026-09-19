import java.util.ArrayList;
import java.util.Scanner;

class Book{
    String author;
    boolean issued;
    int id;
    String title;
    Book(int id, String title,String author){
        this.id = id;
        this.author = author;
        this.title = title;
        this.issued = false;
    }
void displayBook(){
    System.out.println("Book_ID:"+id);
    System.out.println("Author:"+author);
    System.out.println("Title:"+title);
    System.out.println("Status:"+(issued ? "Issued": "Available"));
}
}
    public class libraryManagement{
    static ArrayList<Book> books = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    //add book
    static void addBook(){
    System.out.println("Enter book ID:");
    int id = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter book title:");
    String title = sc.nextLine();
    sc.nextLine();
    System.out.println("Enter author name:");
    String author = sc.nextLine();
    books.add(new Book(id,title,author));
  System.out.println("Book added Sucessfully!");
    }
    //display book
    static void displayBook(){
if(books.isEmpty()){
    System.out.println(" No Books available.");
    return;
}
for(Book b : books){
    b.displayBook();
}
    }
//search book
    static void searchBook(){
        System.out.println("Enter Book ID to search:");
        int id = sc.nextInt();
        for(Book b : books){
            if(b.id == id){
                b.displayBook();
                return;
            }
        }
       System.out.println("book not found."); 
    }
    //issue book
    static void issueBook(){
    System.out.println("Enter book ID to issue:");
    int id = sc.nextInt();
    for(Book b : books){
        if(b.id == id){
    if(!b.issued){
        b.issued = true;
        System.out.println("Book issued sucessfully.");
    } else{
        System.out.println("Book is already issued.");
    }
  return;
    }
}
System.out.println("Book not found.");
    }
    static void returnBook(){
        System.out.println("Enter book ID to return:");
    int id = sc.nextInt();
    for(Book b : books){
        if(b.id == id){
    if(b.issued){
        b.issued = false;
        System.out.println("Book returned sucessfully.");
    } else{
        System.out.println("Book was not issued.");
    }
  return;
    }
}
System.out.println("Book not found.");
    }
    public static void main(String[] args) {
        int choice;
        do{
            System.out.println("LIBRARY MANAGEMENT SYSTEM =====");
            System.out.println("Add Book");
            System.out.println("Display Book");
            System.out.println("Search Book");
            System.out.println("Issue Book");
            System.out.println("Return Book");

            System.out.println("Enter your choice");
             choice = sc.nextInt();

             switch(choice){
                case 1:
                    addBook();
                    break;
                case 2:
                    displayBook();
                    break;
                case 3:
                    searchBook();
                    break;
                case 4:
                    issueBook();
                    break;
                case 5:
                    returnBook();
                    break;
                case 6:
                    System.out.println("Thank You!");
                    break;
                 default:
                    System.out.println("Invalid choice.");
             }
        }while(choice != 6);
    }
}
