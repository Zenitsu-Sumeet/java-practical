import java.util.Scanner;



public class avaeage {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;
        System.out.println("enter the first subject marks OUT OF 50");
        a = in.nextInt();
        System.out.println("enter the second subject marks OUT OF 50");
        b = in.nextInt();
        System.out.println("enter the third subject marks OUT OF 50");
        c = in.nextInt();
        d=(a+b+c)/3;
        System.out.println("total average of all subject "+d);

        if(d>=39){
            System.out.println("success");
        }
        else{
            System.out.println("failure");
        }

    }
}
