import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter value of A & B");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("A before swap :"+a);
        System.out.println("B before swap :"+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("A After swap :"+a);
        System.out.println("B After swap :"+b);

    }
}
