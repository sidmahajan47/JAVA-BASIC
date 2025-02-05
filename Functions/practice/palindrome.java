public class palindrome{

    public static int pali(int n){
        int s = 0;
        int c; 
        c = n;
        while(n>0){
            int rem = n%10;
            s = (s*10)+rem;
            n = n/10;
        }
        if(c==s){
            System.out.println("The following number is  palindrome");

        }else{
            System.out.println("The following number is  not palindrome");
        }

        return n;

    }
    public static void main(String[] args) {

        pali(101);

    }
}