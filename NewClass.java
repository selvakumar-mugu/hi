
import java.util.Scanner;


public class NewClass {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String sz=s.next();
        
        String b;
        StringBuffer a=new StringBuffer();
        b=sz.replaceAll("[aeiou]","");
        System.out.println(b);
         StringBuffer df=new StringBuffer(b);
        a=df.reverse();
        
        System.out.println(a);         ;
        
       
      
        
        
        
    }
    
}
