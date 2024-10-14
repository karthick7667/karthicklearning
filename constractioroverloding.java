import java.util.*;
import java.lang.*;

//parameterised constractored and constractor overloading
class box
{
    float length;
    float breath;

    public box()//default constractor
    {
        length =5;
        breath =4;
    }
    float area()
    {
        return length*breath;
    }

    public box(float x,float y)  // parameterised constructered
    {
        length =x;
        breath = y;
    }

    public box(float x)
    {
        length = breath = x;
    }
}

public class constractioroverloding {

    public static void main(String[] args) {

        box o = new box();
        System.out.println(o.area());
        
        box o1 = new box(3,6);
        System.out.println(o1.area());

        box o2 = new box(5);
        System.out.println(o2.area());
    }
    
}
