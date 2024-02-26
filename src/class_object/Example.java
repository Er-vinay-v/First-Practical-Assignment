package class_object;

//2. Write a program to create an object of an class which contain a method and call that class method in
//main method.
public class Example {
    public int sum(int a,int b){
        int ans=(a+b)*a;
        return ans;
    }
    public static void main(String[] args) {
        //class object  which is used for calling class method and object
        Example e=new class_object.Example();

        int ans= e.sum(5 ,7);
        System.out.println("sum of two numbers : " +ans);

        //direct method call and print without storing result
        System.out.println("Sum of two numbers : "+e.sum(9,12));

    }
}
