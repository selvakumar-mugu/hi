
import java.util.Scanner;


public class happynumber {
    public static void main(String[] args) {
        
        
        
        
        
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
  int h=num(a);
    
        if(h==1||h==7)
            System.out.println("happy num");
        else
            System.out.println("not happy num");
    }
        
      public static int num(int n){
             int d=0; 

        while(n!=0)
        {
         
            d+=Math.pow(n%10,2);
              n=n/10;
            
              
        }
              
              if(d<10)
                 return d;
             else
                 n=d;
             return num(n);
            }
           }
    

