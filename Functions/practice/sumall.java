public class sumall{
    public static int sumint(int n){
        int sum = 0;
        while(n>0){
           int  lastDigit = n % 10;
           sum = sum + lastDigit;
           n = n / 10;

        }
        System.out.println(" the sum of the digits is = " + sum);
        return sum;
    }
    public static void main(String  args[]) {
        sumint(321);
    }
}