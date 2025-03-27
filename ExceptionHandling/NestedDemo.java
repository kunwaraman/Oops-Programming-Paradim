package ExceptionHandling;
public class NestedDemo {
    public static void main(String[] args) {

        try{
            try {
                int arr[] ={0,1};
                System.out.println(arr[2]);
            }catch (Exception e){
                e.printStackTrace();
                System.out.println("inside");

            }
            int a=10/0;
        }catch (ArithmeticException e){
            e.printStackTrace();
            System.out.println("outside");
        }

    }



}

