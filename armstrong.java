
import java.util.Scanner;




public class NewClass {
    
    public static void main(String []args)
    {
        int x=0;
        Scanner sc=new Scanner(System.in);
        int h=sc.nextInt();
        int n=h;
        while(h!=0)
         {
          
           int s=h%10;
 
          x+=s*s*s;
          
           h/=10;  
             
     
            }
         
         if(n==x)
         System.out.println("No. is armstrong");
         else
         System.out.println("No. is not armstrong");
        }
        
        
        
        
        
        
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
