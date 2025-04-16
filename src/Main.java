//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        byte number = 67;
        short number2 = 1098;
        int number3 = 40000;
        long number4 = 5748398l;
        float number5 = 8.905f;
        double number6 = 5.0987;
        System.out.println("Значение переменной number с типом byte равно " + number);
        System.out.println("Значение переменной number2 с типом short равно " + number2);
        System.out.println("Значение переменной number3 с типом int равно " + number3);
        System.out.println("Значение переменной number4 с типом long равно " + number4);
        System.out.println("Значение переменной number5 с типом float равно " + number5);
        System.out.println("Значение переменной number6 с типом double равно " + number6);
        
        int weightBanan = 80;
        int weight100mlMilk = 105;
        int weightBricket = 100;
        int weightEgg = 70;
        int weightSum = 5 * weightBanan + 2 * weight100mlMilk + 2 * weightBricket + 4 * weightEgg;
        System.out.println("Масса в граммах: " + weightSum + "   в килограммах: " + weightSum/1000);

        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        System.out.println("Маша теперь получает " + mashaSalary * 1,1 + " рублей. Годовой доход вырос на " + mashaSalary * 1,2);
        System.out.println("Денис теперь получает " + denisSalary * 1,1 + " рублей. Годовой доход вырос на " + denisSalary * 1,2);
        System.out.println("Кристина теперь получает " + kristinaSalary * 1,1 + " рублей. Годовой доход вырос на " + kristinaSalary * 1,2);
    }
}
