import java.util.*;
public class logT{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("A = ");
        int a = sc.nextInt();
        System.out.println("B = ");
        int b = sc.nextInt();
        System.out.println("C = ");
        int c = sc.nextInt();

        if((a>=b) && (a>=c)){
            System.out.println("A is the boss "+a);
        }
        else if ((b>=c)){
            System.out.println("B is the boss "+b);
        }
        else {
            System.out.println("C is the boss "+ c);
        }
    }
}