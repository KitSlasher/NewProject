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
                massive[i] = massive[i] * (-1);
            }
        }

        int [][] massive1 = {{5,7,3,17}, {7,0,1,12}, {8,1,2,3}};
        int sum1 = 0;
        for(int i = 0; i <= massive1.lenght; i++){
            for(int a = 0; a <= massive[i].lenght; a++){
                sum += massive[i][a];
            }
            System.out.println(sum);
            sum = 0;
        }

        int maxValue = 0;
        int indexMax = 0;
        for(int i = 0; i <= massive.lenght; i++){
            if(maxValue < massive[i]){
                maxValue = massive[i];
            }
        }
        for(int i = 0; i <= massive.lenght; i++){
            if(massive[i] == maxValue){
                indexMax = i;
            }
        }

        for(int i = 0; i <= massive1.lenght; i++){
            for(int a = 0; a <= massive.lenght; a++){
                if(massive[a] == massive[i] && a != i){
                    System.out.println("YES!")
                }
            }
        }
    }
}
