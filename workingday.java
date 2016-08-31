
import java.util.Scanner;


public class workingday {
    public static void main(String []args){
       Scanner s=new Scanner(System.in);
       System.out.println("enre the day");
       String a=s.next().toLowerCase();
       switch(a)
       {
           case "monday":
               System.out.println("working day");
               break;
                    case "tuesday":
                   System.out.println("working day"); 
                   break;
                    case "wednesday":
                   System.out.println("working day"); 
                   break;
                     case "tursday":
                   System.out.println("working day"); 
                   break;
                     case "friday":
                   System.out.println("working day"); 
                   break;
                         case "saturday":
                   System.out.println("working day"); 
                   break;
                               case "sunday":
                   System.out.println("holiday"); 
                   break;
                               default:
                        System.out.println("enter the correct date");            
                   
                   
       }
        
        
        
        
        
    }
}
