import java.util.*;

public class differentamstrongnumber {


    // progrma find a ampstrong numver in 100  to 999 

    public static void main(String[] args) {
        
        int digit1,digit2,digit3 ,temp,result;
        for(int n= 100;n<=999;n++)
        {
            temp= n;
            digit1= temp%10;
            temp=temp/10;

            digit2=temp%10;
            temp=temp/10;

            digit3=temp%10;

            result =(digit1*digit1*digit1)+(digit2*digit2*digit2)+(digit3*digit3*digit3);

            if (result == n) {
                System.out.println("the number is amstrong number :"+result);
                
            }
            
        }
    }
    
}
