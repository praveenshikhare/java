import java.util.*;
public class array {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int size=Sc.nextInt();
        int numbers[]=new int[size];
        for(int i=0;i<size;i++){
            numbers[i]=Sc.nextInt();   
        }
        int x=Sc.nextInt();
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==x){
                System.out.println("x id found at index : "+i);
            }

        }


    }
    
}
