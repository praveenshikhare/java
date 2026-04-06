import java.util.*;
public class array {
    public static void main(String[] args) {
        // Scanner Sc=new Scanner(System.in);
        // int size=Sc.nextInt();
        // int numbers[]=new int[size];
        // for(int i=0;i<size;i++){
        //     numbers[i]=Sc.nextInt();   
        // }
        // int x=Sc.nextInt();
        // for(int i=0;i<numbers.length;i++){
        //     if(numbers[i]==x){
        //         System.out.println("x id found at index : "+i);
        //     }

        // }

        // Scanner Sc=new Scanner(System.in);
        // int size=Sc.nextInt();
        // int numbers[]=new int[size];
        // for(int i=0; i<size; i++){
        //     numbers[i]=Sc.nextInt();
        // }
        // int max=Integer.MIN_VALUE;
        // int min=Integer.MAX_VALUE;
        // for(int i=0; i<numbers.length; i++){
        //     if(numbers[i]<min){
        //         min=numbers[i];
        //         System.out.println("min is :"+min);
        //     }
        //     else if(numbers[i]>max){
        //         max=numbers[i];
        //         System.out.println("max is :"+max);
        //     }
        // }

        Scanner Sc=new Scanner(System.in);
        int size=Sc.nextInt();
        String names[]=new String[size];
        for(int i=0; i<size; i++){
            names[i]=Sc.nextLine();
        }
        for(int i=0; i<names.length;i++){
            System.out.println(names[i]);
        }


    }
    
}
