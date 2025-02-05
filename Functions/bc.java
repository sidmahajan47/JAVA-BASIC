public class bc {
    
        public static int facto(int n){
            int f = 1;
            int i;
            for(i=1; i<=n;i++){
                f=f*i;
            }
            return f; // this f is factorial of n 
        } 
        
        public static  int bino(int n, int r){
            int fact_n = facto(n);
            int fact_r = facto(r);
            int fact_n_r = facto(n-r);

            int bino = fact_n/(fact_r * fact_n_r);
            return bino;

        }
      public static void main (String args[]){

            System.out.println(bino(5, 2));

    }
}


