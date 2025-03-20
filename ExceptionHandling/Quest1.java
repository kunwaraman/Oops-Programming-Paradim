package ExceptionHandling;

import java.util.Scanner;

public class Quest1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1=sc.nextInt();

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter number 2");
        int num2 = sc.nextInt();

        try{
            int ans=num1/num2;
            System.out.println(ans);
        }catch (ArithmeticException e){

            System.out.println("handled");
        }
    }
}
