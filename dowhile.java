import java.util.*;

public class dowhile {

    public static void main(String[] args) {
        
        System.out.println("Enter the limit :");

        Scanner in =new Scanner(System.in);
        int a=in.nextInt();

        int i=2;

        do{
            System.out.println(i);
            i=i+2;
        }
        while(i<=a);

    }
    
}
