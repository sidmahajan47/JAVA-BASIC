import java.util.*;
public class table{
    public static void main (String args[]){
        int n,i,mul;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(i=1;i<=10;i++){
            mul = n * i ;
            System.out.println(n+"*"+i+"="+mul);
        }
        



    }
}