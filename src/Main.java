//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Map(int, String) books = new HashMap<>();
        books.put(1,"Мертвые души");
        System.out.println("Вы взяли книгу " + books.get(1));

        

        Map(String, List<int>) studentsGrades = new TreeMap<>();
        studentsGrades.put("Иван", List{4,5,3,4,5,5});
        studentsGrades.put("Андрей", List{2,2,3,4,2,4});
        studentsGrades.put("Костя", List{4,4,3,4,4,5});
        studentsGrades.put("Ксюша", List{2,5,3,4,5,5});
        System.out.println("Оценки Ивана: " + studentsGrades.get("Иван"))
    }
}
class ContactsManager{
    private Map<String, int> contacts;
    public void conactManager(){
        contacts = new LinkedHashMap<>();
    }
    public void addContact(String name, int number){
        contacts.put(name, number);
        System.out.println("Контакт " + name + " добавлен");
    }
    public void findContact(String name) {
        if (contacts.containsKey(name)) {
            System.out.println("Найден: " + name + " - " + contacts.get(name)); 
        } else {
            System.out.println("Контакт не найден: " + name); 
        } 
    }
}
