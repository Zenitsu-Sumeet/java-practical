import java.util.Scanner;

class datetimeyear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year:");
        int year = sc.nextInt();
        System.out.println("Enter month:");
        int month = sc.nextInt();
        System.out.println("Enter day:");
        int day = sc.nextInt();
        System.out.println(year + "-" + month + "-" + day);
    }
}