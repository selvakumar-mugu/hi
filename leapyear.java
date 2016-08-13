/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.Scanner;


public class leapyear{

    
    public static void main(String[] args) {
         
        Scanner sc =new Scanner(System.in);
   int bc= sc.nextInt();
     
      
      
      if(bc%4==0) {
            System.out.println("given year  is a leap year");
        
      }              
else 
       
           System.out.println("given" + "  year is not leap year"
                    );
       
           
       
    
   
}
}
