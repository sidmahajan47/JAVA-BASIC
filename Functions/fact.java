public class fact {
        public static int facto(int n){
            int f = 1;
            int i;
            for(i=1; i<=n;i++){
                f=f*i;
            }
            return f; // this f is factorial of n 
        }             
      public static void main (String args[]){

            System.out.println(facto(4));

    }
}
