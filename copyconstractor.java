import java.util.*;
import java.lang.*;

class complex
{
   private int real,image;
    public complex(){
        this.real =5;
        this.image =6;
    }
    public complex(int r ,int i)
    {
        this.real=r;
        this.image=i;
    }

    public complex(complex o1)
    {
        this.real =o1.real;
        this.image = o1.image;
    }

    public String toString()
    {
        return "(" + real + "+" + image + "i)";
    }

   
}

public class copyconstractor {

    public static void main(String[] args) {
        complex o1 = new complex();
        System.out.println("object 1 :"+o1);


        complex o2 = new complex(5,3);
        System.out.println("Object 2 :"+o2.toString() );
        
        complex o3 = new complex(o1);
        System.out.println("Object 3: "+o3);
    }
    
}
