package List.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class BookCatalog {
    private List<Book> bookList;

    public BookCatalog() {
        this.bookList = new ArrayList<>();
    }

    public void addBook(String title, String author, int year) {
        bookList.add(new Book(title, author, year));
    }

    public Book searchBook(String title) {
        Book targetBook = null;
        
        if (!bookList.isEmpty()) {
            for (Book book : bookList) {
                if (book.getTitle().equals(title)) {
                    targetBook = book;
                    break;
                }
            }
        }
        return targetBook;
    }

    public List<Book> searchBooksByAuthor(String author) {
        List<Book> authorBooks = new ArrayList<>();
        
        if(!bookList.isEmpty()) {
            for (Book book : bookList) {
                if (book.getauthor().equalsIgnoreCase(author)) {
                    authorBooks.add(book);
                }
            }
        }
        return authorBooks;
    }

    public List<Book> searchBooksByYearsInterval(int startingYear, int finalYear) {
        List<Book> booksByYearsIntevalList = new ArrayList<>();
        
        if(!bookList.isEmpty()) {
            for (Book book : bookList) {
                if (book.getReleasingYear() >= startingYear && book.getReleasingYear() <= finalYear) {
                    booksByYearsIntevalList.add(book);
                }
            }
        }
        return booksByYearsIntevalList;
    }

}
