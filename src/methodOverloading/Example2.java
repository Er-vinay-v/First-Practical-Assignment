package methodOverloading;

public class Example2 {
    static float show(float f){
        return f+f;
    }
    static char show(char c){
        System.out.println("this method return char");
        return c;
    }
    static long show(long l){
        return l+l;
    }
    public static void main(String[] args) {

        System.out.println(show(45.7f));
    }
}
