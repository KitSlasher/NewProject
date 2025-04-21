//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int age = 5;
        if(age >= 2 && age <= 6){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        if(age >= 7 && age <= 17){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if(age >= 18 && age <= 23){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        if(age >= 24){
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }

        int quantity = 50;
        if(quantity < 60){
            System.out.println("В вагоне есть сидячие и стоячие места");
        }else if(quantity < 102 && qantity >=60){
            System.out.println("В вагоне есть стоячие места");
        }else{
            System.out.println("В вагоне нет мест");
        }

        int year = 2015;
        if((year % 4 ==0 && yaer % 100 != 0) || year % 400 == 0){
            System.out.println(year + " год является високосным");
        }else{
            System.out.println(year + " год  не является високосным");
        }

        int monthNumber = 1;
        swith(monthNumber){
            case 1:
                System.out.println("Это зимний месяц");
            
        }
    }
}
