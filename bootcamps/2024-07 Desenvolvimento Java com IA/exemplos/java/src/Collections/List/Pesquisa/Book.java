package List.Pesquisa;

public class Book {
    private String title;
    private String author;
    private int releasingYear;
    
    public Book(String title, String author, int releasingYear) {
        this.title = title;
        this.author = author;
        this.releasingYear = releasingYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getauthor() {
        return author;
    }
    
    public void setauthor(String author) {
        this.author = author;
    }

    public int getReleasingYear() {
        return releasingYear;
    }
    
    public void setReleasingYear(int releasingYear) {
        this.releasingYear = releasingYear;
    }


    @Override
    public String toString() {
        return "Autor = " + author + " / " +
            "Titulo = " + title + " / " +
            "Lançamento = " + releasingYear;
    }

}
