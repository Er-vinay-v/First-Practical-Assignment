package methodOverloading;

// QUESTION : 1. Write a program to demonstrate method overloading with 3 different parameters.
public class Example {
    public void display(byte b){
        System.out.println("value of byte :"+b);
    }

    public void display(short b){
        System.out.println("value of short :"+b);
    }

    public void display(int  b){
        System.out.println("value of int :"+b);
    }

    public void display(double b){
        System.out.println("value of double :"+b);
    }
    public static void main(String[] args) {
        Example e=new methodOverloading.Example();
       // byte b=10; if i will explicitly define byte and short data type then run byte and short method
        //otherwise by default int variable method

       e.display(4.5);
    }
}
