package ExceptionHandling;

public class Quest2 {
    public static void main(String[] args) {
        int arr[] = new int[5];
        try{
            System.out.println(arr[5]);
            System.out.println("hi");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("insuffient index");
        } finally {
            System.out.println("running");
        }
    }
}
