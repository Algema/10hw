import java.util.Objects;

public class Book {
    private String nameBook;
    private  int publicationYear;
    private Author author;
    public Book ( String nameBook, int publicationYear, Author author) {
        this.nameBook = nameBook;
        this.publicationYear= publicationYear;
        this.author = author;
    }
    public String getNameBook() {
        return this.nameBook;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublicationYear() {
        return this.publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    public String toString (){
        return " Название " + this.nameBook + " Год публикации " + this.publicationYear  + this.author;
    }
    public boolean equals(Book book12) {
        if(this.nameBook.equals(book12.nameBook)&& this.author.equals(book12.author)){
            return true;
        } else{
            return false;
        }
    }
    public int hashCode() {
        return Objects.hash(nameBook+author);
}
}
