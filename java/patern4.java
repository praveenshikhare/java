import java.util.*;
public class patern4 {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int num=Sc.nextInt();
        for(int i=1;i<=num;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
      

    }
}
