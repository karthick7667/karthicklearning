import java.util.*;
import java.lang.*;

class Rectangle{
    private int length,width;

    // use getter and setter method for get and set a values
    int getlength(){
        return length;
    }

    void setlength(int l){
        length =l;
    }

    //getter method
    int getwidth(){
        return width;
    }

    //setter method
    void setwidth(int w){
        width=w;
    }


    int area(){
        int a = length*width;
        return a;
    }
}

public class datahiding_geter_setters {

public static void main(String[] args) {

    Rectangle r = new Rectangle();
    r.setlength(50);
    r.setwidth(30);
    System.out.println("Area :"+r.area());
    System.out.println("Length :"+r.getlength());
    System.out.println("Width :"+r.getwidth());
    
}
}
