import java.util.Scanner;

class large{
    public static void main(String[] args) {
        //print larger numbers
        Scanner in = new Scanner(System.in);
        int a;
        int b;
        System.out.println("enter the number");
        a = in.nextInt();
        System.out.println("enter the number 2");
        b = in.nextInt();
        System.out.println("lager the number");
        if(a>b){
            System.out.println(a);
        }
        else{
            System.out.println(b);
        }
        System.out.println("samllest number");
        if(b>a){
            System.out.println(a);

        }
        else{
            System.out.println(b);
        }

    }
}