//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        for(int i = 1; i <= 10; i++){
            System.out.println(i)
        }

        for(int i = 0; i < 21; i = i + 2){
            System.out.println(i)
        }

        for(int i = 7; i <= 100; i = i + 7){
            System.out.println(i)
        }

        for(int i = 1; i <= 100; i++){
            System.out.println("Месяц " + i + ". Сумма накоплений равна " + i * 12000 + "рублей")
        }
    }
}
