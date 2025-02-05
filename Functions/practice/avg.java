public class avg{

    public static int avg_3(int a, int b, int c){
        int avg = (a+b+c)/3;
        System.out.println("The average of the three numbers is: " + avg);
        return avg;

    }
    public static void main(String[] args) {
        avg_3(1,3,5);
    }
}