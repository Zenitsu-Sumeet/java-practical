import java.util.Scanner;

class swap{
    public static void main(String[] arg){
                Scanner in = new Scanner(System.in);

          int a;
        int b;
        System.out.println("enter the number");
        a = in.nextInt();
        System.out.println("enter the number 2");
        b = in.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        system.out.println(a);
        System.out.println(b);
    }
}