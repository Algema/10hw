public class Main {
    public static void main(String[] args) {
        Author authorR= new Author("J.K","Rowling");
        Book book1 = new Book(" Harry Potter and the philosopher's stone",1997, authorR);
        System.out.println(authorR.getName()+ " "+authorR.getSurname()+book1.getNameBook()+" "+book1.getPublicationYear());
        Author authorC = new Author("C.S","Lewis");
        Book book2 = new Book("The chronicles of Narnia",1950,authorC);
        System.out.println( authorC.getName()+" "+authorC.getSurname()+ book2.getNameBook()+" "+book2.getPublicationYear());
        book1.setPublicationYear(2000);
        System.out.println(book1.getPublicationYear());
        System.out.println(book1);
        System.out.println(book2);
        boolean A = authorC.equals(authorR);
        System.out.println(A);
        boolean B = book1.equals(book2);
        System.out.println(B);


    }
}