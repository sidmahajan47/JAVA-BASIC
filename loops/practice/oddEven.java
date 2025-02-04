import java.util.*;
public  class oddEven{
    public static void main (String args []){
        int i,n,sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms");
        n = sc.nextInt();

        if(n%2==0){
            for(i=1;i<=n;i=i+2){
                sum = sum + i;
            }
            System.out.println("Even ADD =  " + sum);
        }else{
            for(i=1;i<=n;i=i+2){
                sum = sum+i;

            }
            System.out.println("sum of odd is  " + sum );
        }



}
}