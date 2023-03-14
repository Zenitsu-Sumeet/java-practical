import java.util.Scanner;

public class numvber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int a;
      int b;
      System.out.println("enter the number");
      a = in.nextInt();
      System.out.println("enter the number 2");
      b = in.nextInt();
      System.out.println("enter the number 2");
     int c = in.nextInt();
     System.out.println("largest number is");
     if(a>b){
        System.out.println(a);

     }
     else if(b>c){
        System.out.println(b);
     }
     else{
        System.out.println(c);
    }
    System.out.println("samllest number is");

    if(a<b){
        System.out.println(a);

     }
     else if(b<c){
        System.out.println(b);
     }
     else{
        System.out.println(c);
    }
}
}
