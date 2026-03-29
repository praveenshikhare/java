import java.util.*;
public class greeting {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int button=Sc.nextInt();
        switch(button){
            case 1:
                System.out.println("hello");
                break;
                case 2:
                    System.out.println("good morning");
                    break;
                    case 3:
                        System.out.println("good evening");
                        break;
                        default:
                            System.out.println("invalid choice");
                            break;


                        } 
        
        
    }   
}
