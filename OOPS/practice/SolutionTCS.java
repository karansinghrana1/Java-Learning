package practice;

// import java.io.*;
import java.util.*;
// import java.text.*;
// import java.math.*;
// import java.util.regex.*;
// import java.util.stream.Collector;

class Book{
    int id;
    String title;
    String author;
    double price;
    Book(int id,String t,String a,double p){
        this.id=id;
        this.title=t;
        this.author=a;
        this.price=p;
    }
}

public class SolutionTCS {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc = new Scanner(System.in);
        List<Book> books = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            int id = sc.nextInt();
            sc.nextLine();
            String t =sc.nextLine();
            String a = sc.nextLine();
            double p = sc.nextDouble();
            sc.nextLine();
            Book book = new Book(id, t, a, p);
            books.add(book);
        }
        List<Book> sortedBooks = sortBooksByPrice(books);
        for (Book book : sortedBooks) {
            System.out.println(book.id+" " + book.title+" " + book.author+" "+book.price);
        }
        
    }
    public static List<Book> sortBooksByPrice(List<Book> books){
       
        Collections.sort(books,Comparator.comparingDouble(xy->xy.price));
        return books;
        
    }
}