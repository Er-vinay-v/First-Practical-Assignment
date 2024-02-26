package sumOfArrayElements;
// Question :3. Write a Java program to calculate the sum of all elements in an integer array?
public class Demo {
    public static void main(String[] args) {

        int[]arr={2,3,5,7,9,8,34};
        int sum=0;
        for(var i:arr){
            sum+=i;
        }
        System.out.println("sum of all array elements is : "+sum);
    }
}
