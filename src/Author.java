import java.util.Objects;

public class Author {
    private String name;
    private String surname;
    public Author (String name, String surname){
        this.name = name;
        this.surname = surname;
    }
    public String getName (){
        return this.name;
    }
    public String getSurname(){
        return this.surname;
    }
    public String toString() {
        return " Автор " +  this.name + " " +  this.surname;
    }


    public boolean equals(Author author1) {
     if(this.name.equals(author1.name)&& this.surname.equals(author1.surname)){
         return true;
     } else{
         return false;
     }
    }

    public int hashCode() {
        return Objects.hash(name+surname);
    }
}
