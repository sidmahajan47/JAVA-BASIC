import java.util.*;
public class prime{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean prime = true;
        if(n == 2){
            System.out.println("prime");

        }else{
            for (int i =2 ; i<=n-1; i++) {
                if(n%2==0){
                    prime = false;
                }
    
            }
            if(prime == true){
                System.out.println("Prime");
            }else{
                System.out.println("Not Prime");
            }

        }
       
    }
}