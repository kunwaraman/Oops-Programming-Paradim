package ExceptionHandling;

import java.util.Scanner;

 public class Quest3 {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int age = sc.nextInt();
         if(age < 18){
             throw new demo("InvalidAge Exception");
         }
     }

}
 class demo extends RuntimeException{
     demo(String str){
         super(str);
     }

}
