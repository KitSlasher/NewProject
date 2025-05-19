//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Animal lion = new Animal();
        lion.thisAnimal;
    }
}
class Animal{
    String type;
    String name;
    public Animal(String type, String name){
        this.name = name;
        this. type = type;
    public void thisAnimal(String name, String type)P{
        System.out.println("Это " + type + " по имени " + name)
    }
}

class Library{
    String[] books = new String[a];
    public void addBook(String nameBook){
        books.append(nameBook);
    }
    public void bookss(String[] books){
        for(String book: books){
            System.out.println(book);
        }
    }
    public void searchBook(String bookz){
        for(String book: books){
            if(book == bookz){
                System.out.println("Книга " + bookz + " найдена");
            }else{
                System.out.println("Книга " + bookz + "  не найдена");
            }
        }
    }
}
