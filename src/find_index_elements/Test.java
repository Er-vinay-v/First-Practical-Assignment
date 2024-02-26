package find_index_elements;
//Question :-4. Write a Java program to find the index of a specific element in an integer array.?
public class Test {
    public static void main(String[] args) {
      int[]arr={3,4,5,6,7,8,9,12};
        java.util.Scanner sc=new java.util.Scanner(System.in);
        System.out.println("Enter index number :");
        int index=sc.nextInt();
        if(index>arr.length){
            System.out.println("Invalid input index !");
            System.out.println("please enter valid input...");
        }else{
            System.out.println(arr[index]);
        }

    }
}
