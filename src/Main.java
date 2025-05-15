//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        sum = 1;
        sumx = 0;
    }
    public void sum(int a, int b){
        return a * b;
    }

    public void sumx(int n){
        if(n < 1){
            for(int i; i > n; i--){
                sum += i;
            }
        }else{
            for(int i; i < n; i++){
                sum += i;
            }
        }
    }

    public void buyItem(String name){
        return "Вы купили: " + name;
    }
    public void buyItem(String name, int coast, int quantity){
        return "Вы купили: " + name + " за " + coast + " рублей, в количестве" + quantity;
    }

    public int sumnum(int a){
        if(a % 10 == null){
            return null
        }
        sumx += a % 10;
        return sumnum(a % 10)
    }

    public void S(int a){
        return a * 4;
    }
}
