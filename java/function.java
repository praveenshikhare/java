import java.util.*;
public class function {
    // public static void printMyName(String name ){
    //     System.out.println(name);
    //     return;

    // }

    // public static void main(String[] args) {
    //     Scanner Sc=new Scanner(System.in);
    //     String name =Sc.nextLine();
    // }

    //     printMyName(name);

    //  public static int calculateSum(int a,int b){
    //     int sum=a+b;
    //     return sum;
    //  }   
    // public static void main(String[] args) {
    //     Scanner Sc=new Scanner(System.in);
    //     int a=Sc.nextInt();
    //     Scanner sc=new Scanner(System.in);
    //     int b=sc.nextInt();
    //     int sum=calculateSum(a,b);
    //     System.out.println("sum of a and b is="+sum );
    // }
    
    // multiflication of two number 
    // public static int calculateProduct(int a, int b){
    //     int product=a*b;
    //     return product;
    // }
    // public static void main(String[] args) {
    //     Scanner Sc=new Scanner(System.in);
    //     int a=Sc.nextInt();
    //     Scanner sc=new Scanner(System.in);
    //     int b=Sc.nextInt();  
    //     int product=calculateProduct(a,b);
    //     System.out.println("product of 2 number is : "+product);
    // }

    // factorial of a number 
    public static void calculateFactorial(int n){
        if(n<0){
            System.out.println("invalid number");
            return;
        }
        int factorial =1;
        for(int i=n; i>=1; i--){
            factorial=factorial*i;
            
        }
        System.out.println("factorial of number : "+factorial);
        return;
    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int n =Sc.nextInt();
        calculateFactorial(n);

        
        
    }
    
}
