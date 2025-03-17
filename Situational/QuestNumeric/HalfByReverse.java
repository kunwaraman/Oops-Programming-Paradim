package Situational.QuestNumeric;

public class HalfByReverse {
    public static void main(String[] args) {
        long number=352164;
        String num=Long.toString(number);
        int len=num.length();
        int mid=len/2;
        String half=num.substring(0,mid);
        String sb = new StringBuilder(half).reverse().toString();
        String second = num.substring(mid);
        long task1res=Long.parseLong(sb+second);



    }
}
