package List.Pesquisa;

public class App {
    public static void main(String[] args) {
        BookCatalog bookCatalog = new BookCatalog();
        bookCatalog.addBook("teste 1", "autor 1", 2005);
        bookCatalog.addBook("teste 1", "autor 2", 2002);
        bookCatalog.addBook("teste 3", "autor 2", 2006);

        System.out.println(bookCatalog.searchBook("teste 1"));
        System.out.println(bookCatalog.searchBooksByAuthor("autor 2"));
        System.out.println(bookCatalog.searchBooksByYearsInterval(2000, 2005));
    }

}
