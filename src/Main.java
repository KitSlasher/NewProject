//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] massive = {1, -4, 9, 67, -45, 2};
        for(int number: massive){
            System.out.println(number);
        }
        for(int i = 0; i < massive.lenght; i++){
            massive[i] = massive[i] * 2;
        }
        System.out.println(massive);
    }
}
