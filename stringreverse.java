
import java.util.Scanner;


 
public class stringreverse {
    public static void main(String [] args) 
    {
       Scanner s=new Scanner(System.in);
        System.out.println("enter the string you want to reverse");
        String A=s.next();
        StringBuffer result=new StringBuffer(A);
        result.reverse();
        
    
    System.out.println("reverse string is  "+result);
    
}
}
