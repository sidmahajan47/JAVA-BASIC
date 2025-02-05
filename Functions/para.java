import java.util.*;
public class para {
    public static void calcSum(int a, int b){ //parameters or formal parameters
        int sum = a + b;
        System.out.println("the sum is : "+sum);

    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        calcSum(a,b); // arguments or actual parameters

    }
}
