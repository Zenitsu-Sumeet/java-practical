import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int b;
        System.out.println("enter the number");
        a = in.nextInt();
        System.out.println("enter the number 2");
        b = in.nextInt();
        System.out.println("quotient "+a % b);
        System.out.println("reminader "+a / b);


    }
}
