public class hollowrectangle{

    public static void Daimond(int n){
        for(int i = 1; i<=n;i++){
            for(int j = 1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = n; i>=1;i--){
            for(int j = 1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1;j<=(2*i)-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }   

    public static void Rm(int n){
        for(int i = 1;i<=n;i++){
            for(int j = 1; j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void HRhm(int n){
        for(int i = 1;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n;j++){
                if(j==1 || j==n || i==1 || i==n ){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    public static void Hpattern(int totRows,int totCl){
        //outer loop
        for(int i=1;i<=totRows;i++){
            //inner loop
            for(int  j =1; j<=totCl; j++){
                //cell-(i,j);
                if(i == 1 || i == totRows || j == 1 || j == totCl){
                    //boundary cells
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }

            }
            System.out.println();
        }

    }

    public static void InPy(int n){
        //outer loop
        for(int i=1;i<=n;i++) {
            //inner loop
            for(int j = 1; j <= n - i; j++) {
                System.out.print(" ");

             }
             //stars
             for(int j=1; j<=i; j++){
                System.out.print("*");
             }
             System.out.println();
        }
    }
    public static void InpyNum(int n ){

        for (int i = 1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j + " ");

        }
        System.out.println();
    }
}

    public static void Optinpy(int n){
        for(int i=1;i<=n;i++){

            for(int j = n; j>0;j--){
                if(j>i){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();


    }
}
    public static void  flyod_triangle(int n ){
        int counter = 1;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();
        }
    }
    public static void BinPattern(int n){
        for(int i=1;i<=n;i++){

            for(int j=1;j<=i;j++){
                if((j+i)%2==0){
                    System.out.print("1");
            }
            else{
                System.out.print("0");
            }
        }
        System.out.println();
        }
    }
    public static void Butterfly(int n){
        for(int i=1;i<=n;i++){
            //stars
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces 2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars - i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2md Half
        for(int i=n; i>=1;i--){

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            //spaces 2*(n-i)
            for(int j=1;j<=2*(n-i);j++){
                System.out.print(" ");
            }
            //stars - i
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        
    }
  
    public static void main(String args []){
        System.out.println("Here is the Hollow Rectangle");
        System.out.println();
        Hpattern(4, 4);
        System.out.println();
        System.out.println("Here is the Inverted Pyramid : ");
        System.out.println();
        InPy(7);
        System.out.println();
        System.out.println("Here is the optimised Inverted Pyramid : ");
        System.out.println();
        Optinpy(4);
        System.out.println();
        System.out.println("Here is the Number Pyramid");
        System.out.println();
        InpyNum(4);
        System.out.println();
        System.out.println("Here is the flyod Triangle : ");
        System.out.println();
        flyod_triangle(10);
        System.out.println();
        System.out.println("Here is the Binary 0-1 Triangle : ");
        System.out.println();
        System.out.println();
        BinPattern(5);
        System.out.println();
        System.out.println("Butterfly Butterfly where are you going");
        System.out.println();
        System.out.println();
        Butterfly(10);
        System.out.println();
        System.out.println("Here is the Solid Rohmbus :");
        System.out.println();
        System.out.println();
        Rm(7);
        System.out.println();
        System.out.println();
        System.out.println("Here is the Hollow Rohmbus");
        System.out.println();
        System.out.println();
        HRhm(5);
        System.out.println();
        System.out.println();
        System.out.println("Here is the Daimond : ");
        System.out.println();
        Daimond(7);
        System.out.println();
        System.out.println();


    }
}