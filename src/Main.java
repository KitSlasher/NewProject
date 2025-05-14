//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String text = "Я приехал отдыхать на пляж";
        int val = text.indexOf("Java");
        if(val > 0){
            System.out.println("Длинна строки: " + text.lenght + ". Первый символ: " + text.charAt(0) + ". Содержит Java: Да");
        }else{
            
            System.out.println("Длинна строки: " + text.lenght + ". Первый символ: " + text.charAt(0) + ". Содержит Java: Да");
        }

        System.out.println(text.substring(2, 11).toUpperCase);

        String name = "яблоко";
        int quantity = 3;
        int coast = 100;
        
            System.out.println("Вы купили " + name + ", количество: " + quantity + ", итоговая стоимость: " + coast);
    }
}
