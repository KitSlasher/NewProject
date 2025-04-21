//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int number = 1;
        while(number <= 50){
            if(number % 2 == 0){
                System.out.println(number)
            }
            number++;
        }

        int number1 = 1;
        int quantity = 0;
        do{
            if(number1 % 7 == 0){
                quantity++;
            }
            number++;
        }while(number <= 100);

        int number2 = 1;
        int sum = 0;
        while(number2 <= 100){
            sum = sum + number2;
            number2++;
        }
        System.out.println(sum);

        sum1 = 0
        do{
            int v = int (Math.random() * 20) + 1;
            sum = sum + v;
        }while(v != 15)
    }
}
