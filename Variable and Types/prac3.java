
import java.util.*;
public class prac3{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        float pencil = sc.nextFloat();
        float pen = sc.nextFloat();
        float eraser = sc.nextFloat();
        float total = pencil + pen + eraser;
        System.out.println("the fukin bill is "+total);
        // 18 takke gst lagaya toh
        float gst = total + (0.18f*total);
        System.out.println("after 18 takke GST : "+gst);

    }
}