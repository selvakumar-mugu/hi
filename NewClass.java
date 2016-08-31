
import java.util.Scanner;


public class NewClass {
    public static void main(String []args){
        Scanner s=new Scanner(System.in);
        String a = "";
        
        System.out.println("enter the length of string");
       int n =s.nextInt();
       String []sarr=new String[n];
        System.out.println("enter the rotae element");
       int k=s.nextInt();
       System.out.println("enter the  elements");
        for(int i=0;i<n;i++){
            sarr[i]=s.next();
            a+=sarr[i];
           }
        String ans=(a.substring(n-k)+a.substring(0, n-k)).replace("", ",");
        int l=ans.length();
        System.out.println(ans.substring(1, l-1));
    
}
}