import java.io.*;
import java.util.*;

abstract class Calc {
    abstract void calculate(int x);
    abstract void hello();
    abstract void tv();
}

class Sub1 extends Calc {
    void calculate(int x) {
        System.out.println(x * x);
    }
    void hello(){

        System.out.println("\nHello\n");
    }
    void tv(){
        System.out.println("Sony LED\n");
    }
}

class Sub2 extends Calc {
    void calculate(int x) {
        System.out.println(x * x * x);
    }
    void hello(){

        System.out.println("Hello 2\n");
    }
    void tv(){
        System.out.println("2 Sony LED\n");
    }
    
}

class Sub3 extends Calc {
    void calculate(int x) {
        System.out.println(Math.sqrt(x));
    }
    void hello(){

        System.out.println("Hello 3\n");
    }
    void tv(){
        System.out.println("3 Sony LED\n");
    }
}

public class Abstract1 {
    public static void main(String[] args) {
        Sub1 s1 = new Sub1();
        Sub2 s2 = new Sub2();
        Sub3 s3 = new Sub3();
        s1.calculate(2);
        s2.calculate(4);
        s3.calculate(16);
        Calc ref;
        ref=s1;
        ref.hello();
        ref.tv();
        ref=s2;
        ref.hello();
        ref.tv();
        ref=s3;
        ref.hello();
        ref.tv();


    }
}
