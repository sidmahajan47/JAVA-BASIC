import java.util.*;
public class week {
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        switch (n) {
            case 1: System.out.println("MONDAY");
                
                break;
            case 2: System.out.println("TUESDAY");
                break;
            case 3: System.out.println("WEDNESDAY");
            case 4: System.out.println("THURSDAY");
            case 5: System.out.println("FRIDAY");
            case 6: System.out.println("SATURDAY");
            case 7: System.out.println("SUNDAY");
        
            default:
                break;
        }


    }
}