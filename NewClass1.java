
import java.util.Scanner;


public class  NewClass1{
   
 public static void main(String[] args) {
   
     Scanner s=new Scanner(System.in);
     int r=0;
     int a=s.nextInt();
 while(a!=0){
     r=r*10;
     r=r+a%10;
 a/=10;
 }
     System.out.println(r);
}
}
    
