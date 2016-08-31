
package logical;

import java.util.Scanner;


public class Logical {

  
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        System.out.println("enter in form hr:min");
       
        String a=s.next();
       String b=s.next();
     int result;
       int h;
      int g;
      int []inta= new int[2];
      int []intb= new int[2];
      String []stra=new String[2];
       String []strb=new String[2];
       try {
           stra=a.split(":");
           
         strb=b.split(":");
         for(int i=0;i<=1;i++){
         inta[i]=Integer.parseInt(stra[i]);
          intb[i]=Integer.parseInt(strb[i]);
    }
       h=Math.abs(intb[0]-inta[0]);
            
          h*=60;
         g=(intb[1]-inta[1]);
       result=h+g;
       
       
        System.out.println("the mins is " +result);  
       }catch(Exception e)
       {
           System.out.println("array out of exception");
       }
}
}