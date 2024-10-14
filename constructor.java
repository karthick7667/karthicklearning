import java.util.*;
import java.lang.*;


class Rectangleshape{

    int length,width;
    
    int area(){
        int a= length * width;
        return a;
    }
    Rectangleshape(){
        System.out.println("The Constructared Called");
        length =20;
        width = 10;
    }

}

public class constructor {

    public static void main(String[] args) {

        Rectangleshape o = new Rectangleshape();
        System.out.println(o.area()); 

    }
}
