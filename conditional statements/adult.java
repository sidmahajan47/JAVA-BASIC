import java.util.*;
public class adult{
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n>=18) {
            System.out.println("YOU ARE ABLE TO WATCH PORN");

        }
        else{
            System.out.println("YOU ARE NOT ABLE TO WATCH PORN");
        }
        if (n > 13 && n < 18 ) {
            System.out.println("NUNI");
        }

    }
}