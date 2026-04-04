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
    // public static void calculateFactorial(int n){
    //     if(n<0){
    //         System.out.println("invalid number");
    //         return;
    //     }
    //     int factorial =1;
    //     for(int i=n; i>=1; i--){
    //         factorial=factorial*i;
            
    //     }
    //     System.out.println("factorial of number : "+factorial);
    //     return;
    // }
    // public static void main(String[] args) {
    //     Scanner Sc=new Scanner(System.in);
    //     int n =Sc.nextInt();
    //     calculateFactorial(n);
    
    // }

    // even or odd
    // public static void checkEvenOrOdd(int n){
    //     if(n%2==0){
    //         System.out.println("even");
    //         return;
    //     }else{
    //         System.out.println("odd");
    //         return;
    //     }
    // }
    // public static void main(String[] args) {
    //     Scanner Sc =new Scanner(System.in);
    //     int n=Sc.nextInt();
    //     checkEvenOrOdd(n);

    // }

    // table of a number
    // public static void printTable(int n){
    //     for(int i=1; i<=10; i++){
    //         System.out.println(n*i);   
    //     }
    // } 
    // public static void main(String[] args) {
    //     Scanner Sc=new Scanner(System.in);
    //     int n=Sc.nextInt();
    //     printTable(n);
    // }
    // public static float printAverage(int a, int b, int c){
    //     float average=(a+b+c)/3;
    //     return average;
    // }
    // public static void main(String[] args) {
    //     Scanner Sc=new Scanner(System.in);
    //     int a=Sc.nextInt();
    //      Scanner sc=new Scanner(System.in);
    //     int b=sc.nextInt();
    //      Scanner SC=new Scanner(System.in);
    //     int c=SC.nextInt();
    //     float average=printAverage(a,b,c);
    //     System.out.println("average of 3 number is :"+average);
    // }

    // public static void printSumOfOddnumbers(int n){
    //     int sum=0;
        
    //     for(int i=1; i<=n; i++){
    //         if(i%2 !=0){
    //             sum+=i;

    //         }
            
    //     }
    //     System.out.println("sum of odd numbers:"+sum);
            
          
    // }
    // public static void main(String[] args) {
    //     Scanner Sc=new Scanner(System.in);
    //     int n=Sc.nextInt();
    //     printSumOfOddnumbers(n);
    // }
    // public static void printGreatestOfTwo(int a, int b){
    //     if(a>b){
    //         System.out.println(a+"is greater than"+b);
    //         return;
    //     }else if(b>a){
    //         System.out.println(b+"is greater than"+a);
    //         return;
    //     }else if(a==b){
    //         System.out.println(a+"is equal to"+ b);
    //     }else{
    //         System.out.println("invalid choice");
    //     }

    // }
    // public static void main(String[] args) {
    //     Scanner Sc=new Scanner(System.in);
    //     int a=Sc.nextInt();
    //     Scanner sc=new Scanner(System.in);
    //     int b=Sc.nextInt();
    //     printGreatestOfTwo(a, b);
    // }
    // public static void printCircumferenceOfCircle(int r){
    //     double circumference=2*3.14*r;
    //     System.out.println("circumference of circle: "+circumference);
    // }
    // public static void main(String[] args) {
    //     Scanner Sc=new Scanner(System.in);
    //     int r=Sc.nextInt();
    //     printCircumferenceOfCircle(r);

    // }
    public static void printAgeForVote(int age){
        if(age>=18){
            System.out.println("person eligible for vote");
        }else{
            System.out.println("person is not eligible for vote");
        }
    }
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int age=Sc.nextInt();
        printAgeForVote(age);
    }


}
