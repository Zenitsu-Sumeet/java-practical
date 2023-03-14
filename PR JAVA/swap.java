import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        int temp;
        Scanner in = new Scanner(System.in);
        int a;
        int b;
        System.out.println("enter the number");
        a = in.nextInt();
        System.out.println("enter the number 2");
        b = in.nextInt();
        temp = a; a = b; b = temp;
        System.out.println(a);
        System.out.println(b);

    }
}
