import java.lang.*;
import java.util.*;

public class decimal_to_binary {


    public static void decimal2Binary(int n){
        
        int[] values = new int[1000];
        int i=0;

        while (n > 0) {
            values[i] = n%2;
            n = n/2;
            i++;   
        }
        
        for(int j=i-1;j>=0;j--){
            System.out.print(values[j]);
        }
    }

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the decimal number :");
        int n=in.nextInt();

        System.out.println("Your decimal value :"+n);
        decimal2Binary(n);

    }
    
}
