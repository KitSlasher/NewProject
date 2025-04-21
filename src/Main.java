//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int[] massive = {1, -4, 9, 67, -45, 2};
        int sum = 0;
        for(int i = 0; i <= massive.lenght; i++){
            sum = sum + massive[i];
        }
        System.out.println(sum / massive.lenght);

        for(int i = 0; i <= massive.lenght; i++){
            if(massive[i] < 0){
                massive[i] = massive[i] * -1
            }
        }
    }
}
