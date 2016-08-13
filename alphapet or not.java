/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;


public class JavaApplication1 {

    
    public static void main(String[] args) {
         
        Scanner sc =new Scanner(System.in);
      char  c= sc.next().charAt(0);
     
      
      
      if(c>='a'&&c<='z'||c>='Z'&&c<='Z') {
            System.out.println("given is a alphapet");
        
      }              
else 
       
           System.out.println("given  is not alphapet");
       
           
       
    
   
}
}
