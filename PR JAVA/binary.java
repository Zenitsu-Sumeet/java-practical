 import java.util.Scanner;

public class binary {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number;
        String str="";
        int demical=0;
        int power=0;
        System.out.println("enter the decimal number");
        number=in.nextInt();
        int n = number;
        while(number>0){
            int r= number%2;
            number = number/2;
            str=r+str;
        }
        System.out.println(str);
        int dec = Integer.parseInt(str);
        while(dec!=0){
            int r = dec%10;
            demical = demical+(int)(r*Math.pow(2,power));
            power++;
            dec=dec/10;
        }
        System.out.println("decimal is " +demical);
        }

    }

