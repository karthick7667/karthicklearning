import java.util.*;
import java.lang.*;


class  Rectangle {

    int length ,width;

    void getdetails(int x ,int y){
        length =x;
        width = y;

    }

    int area(){
        int a = length * width ;
        return a;
    }
}


public class class_s_object {
public static void main(String[] args) {

    Rectangle o1 = new Rectangle();
    o1.length =10;
    o1.width = 25;
    System.out.println("Area of Rectangle :"+o1.area());

    Rectangle o2 = new Rectangle();
    o2.getdetails(10, 50);
    System.out.println("Find then :"+o2.area() );

    

}
    
}