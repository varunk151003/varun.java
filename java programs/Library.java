public class Library {
    int collection;
    Book bk;
    Library(int collection,Book bk){
        this.collection=collection;
        this.bk=bk;
    }
    
    void getDetails(){
        System.out.println("title : "+bk.title);
        System.out.println("Author Name : "+bk.atr.name);
        System.out.println("publication : "+bk.publication);
        System.out.println("Total no.of books available : "+collection);
    }
    
    public static void main(String args[]){
        Author at = new Author("Abdul Kalam","He is a former President,scientist and Nobel award winner of India");

        Book b = new Book("Wings of Fire",at,"Roger publications");
        
        Library lb = new Library(1720,b);
        lb.getDetails();
        System.out.println();
        lb.getDetails();
    }
}
class Book{
    String title;
    Author atr;
    String publication;
    Book(String title,Author atr,String publication){
        this.title=title;
        this.atr=atr;
        this.publication=publication;
    }
}

class Author{
    String name;
    String biography;
    Author(String name,String biography){
        this.name=name;
        this.biography=biography;
    }
}