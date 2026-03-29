import java.util.*;
public class operation {
    public static void main(String[] args) {
        Scanner Sc=new Scanner(System.in);
        int a=Sc.nextInt();
        Scanner sc=new Scanner(System.in);
        int b=sc.nextInt();
        Scanner SC2=new Scanner(System.in);
        int operator=sc.nextInt();
        switch(operator){
            case 1:
                System.out.println(a+b);
                break;
                case 2:
                    System.out.println(a-b);
                    break;
                    case 3:
                        System.out.println(a*b);
                        break;
                        case 4:
                            System.out.println(a/b);
                            break;
                            case 5:
                                System.out.println(a%b);
                                break;
                                default:
                                    System.out.println("invalid choice");
                                    break;
        }
       
                               
                
        }



    }
    

