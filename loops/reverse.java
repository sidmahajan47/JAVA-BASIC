
public class reverse {
    public static void main (String args []){
        int n = 10899;

        while(n>0){
            int lastDigit = n % 10;
            System.out.print(lastDigit + " ");
            n = n / 10; //n/=10

        }
        System.out.println(n);

    }
}



// // kisi bhi number ka
//  last digit nikalna 
//  hota toh apn uska remainder
//   lele lete kaise 149%2 == 2 yeh hua uska last digit
// last digit = number % 10
// remove last digit = number / 10