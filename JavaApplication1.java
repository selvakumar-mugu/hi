/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;
import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class JavaApplication1 {

    
    public static void main(String[] args) {
         
        Scanner sc =new Scanner(System.in);
      char  c= sc.next(".").charAt(0);
       if((c=='a'|| c=='e'||c=='i'||c=='o'||c=='u')) {
           System.out.println("given char is vowel");
                   }else
       {
           System.err.println("given char is constraint");
       }
           
       
        
    }
}
