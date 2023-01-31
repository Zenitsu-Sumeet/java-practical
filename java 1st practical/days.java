import java.util.Scanner;

public class days {
    public static void main(String args[]) {
       Scanner sc = new Scanner(System.in);
       System.out.println("enter the number");
       int a = sc.nextInt(0);
        switch (a) {
            case 1:
                System.out.println("Monday ");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("tuesday");
                break;
            case 4:
                System.out.println("wnesday");
                break;
            case 5:
                System.out.println("thurday");
                break;
            case 6:
                System.out.println("friday");
                break;
            case 7:
                System.out.println("sunday");   
                break;             
            default:
                System.out.println("tu pagal  hai");
                break;
        }
    }
}
