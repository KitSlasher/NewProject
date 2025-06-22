//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        
    }
}
class CustomExiption extends Exption{
    public CustomExiption(String message){
        super(message);
    }
}
class ExceptionExample{
    public static void main(String[] args){
        try{
            int b = 100;
            int a = 0;
            System.out.println(b / a);
        }catch(ArithmeticExiption e){
            System.out.println("на ноль делить нельзя");
        }catch(InputMismathcExiption e){
            System.out.println("Делить на строку невозможно");
        }catch(CustomExiption e){
            System.out.println("Делим только на положительные числа")
        }
    }
}
