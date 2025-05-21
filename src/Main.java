//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Car electro1 = new ElectricCar();
        electro1.startEngine;
        electro1.stopEngine;
        electro1.needBatary;
    }
}
class Car{
    private int year;
    private String model;
    private String brand;
    public String startEngine(){
        System.out.println("Двигатель запущен");
    }
    public String stopEngine(){
        System.out.println("Двигатель остановлен");
    }
}
class ElectricCar extends Car{
    private int batary;
    @Override
    public String startEngine(){
        System.out.println("Электродвигатель запущен");
    }
    @Override
    public String stopEngine(){
        System.out.println("Электродвигатель остановлен");
    }
    public String needBatary(){
        if(batary < 20){
            System.out.println("Батарея разряжена, требуется зарядка")
        }
    }
}
