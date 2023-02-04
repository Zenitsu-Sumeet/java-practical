import java.util.Scanner;

public class menuofall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1.circle");
        System.out.println("2.square");
        System.out.println("3.rectangle");

        int choose = sc.nextInt();

        switch (choose) {
            case 1:
                System.out.println("a area");
                System.out.println("b parameters");
                int a = sc.next().charAt(0);
                switch (a) {
                    case 'a':
                        System.out.println("enter the area NUMBER");
                        double area = sc.nextDouble();

                        System.out.println("the area is " + 3.14 * (area * area));
                        break;
                    case 'b':
                        System.out.println("enter the radius number");
                        double radius = sc.nextDouble();
                        System.out.println("the parameters are" + 2 * 3.14 * radius);
                        break;

                }
                break;
            case 2:
                System.out.println("a area");
                System.out.println("b parameters");
                char ab = sc.next().charAt(0);
                switch (ab) {
                    case 'a':
                        System.out.println("enter the area NUMBER");
                        double area = sc.nextDouble();
                        System.out.println("the area is " + (area * area));
                        break;
                    case 'b':
                        System.out.println("enter the number of parameters");
                        double radius = sc.nextDouble();
                        System.out.println("the parameters are" + 4 * radius);
                        break;

                }
                break;
            case 3:
                System.out.println("a area");
                System.out.println("b parameters");
                int abc = sc.next().charAt(0);
                switch (abc) {
                    case 'a':
                        System.out.println("enter the area NUMBER");
                        double area = sc.nextDouble();
                        double lenght = sc.nextDouble();
                        System.out.println("the area is " + (area * lenght));
                        break;
                    case 'b':
                        System.out.println("enter the number of parameters");
                        double radius = sc.nextDouble();
                        double lenghtw = sc.nextDouble();
                        System.out.println("the parameters are" + 2 * (radius + lenghtw));
                        break;

                }
            default:
                System.out.println("invalid choice");

        }
    }
}
