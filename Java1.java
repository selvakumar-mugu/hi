
package java1;

import java.util.Scanner;


public class Java1 {

    
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
     int i=in.nextInt();

     int f=1;
        for(int n=2;n<=i;n++)
        {   f*=n;
        }
        System.out.println(f);
    }
}
