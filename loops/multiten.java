
import java.util.*;
public class multiten {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.println("1. Insert : ");
            int n = sc.nextInt();
            if(n % 10 == 0){
                break;
            }
            System.out.println(n);
        }while(true);
        System.out.println("This is the multiple of ten ");


    }
}
