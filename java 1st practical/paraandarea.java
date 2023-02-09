import java.util.Scanner;

public class paraandarea {
    public static void main(String[] args) {
 


        Scanner in = new Scanner(System.in);
        System.out.println("1.circle");
        System.out.println("2 rectangles");
        System.out.println("3 sqaure");
        int a = in.nextInt();

      
        switch(a){
            case 1:
            int choose=in.nextInt();
            System.out.println("choose ");
            System.out.println("enter the number");
       
                 switch(choose){
                    case 1:
                    System.out.println("enter the length  height");
                    int length= in.nextInt();
                    int breadth=in.nextInt();
                    int area = (int) (length*breadth);
                    System.out.println("the area is "+area);
                    break;
                    case 2:
                    System.out.println("enter the length  height and width");
                    int len= in.nextInt();
                    int bre=in.nextInt();
                    int width=in.nextInt();
                    int para = (int) (len*bre*width);
                    System.out.println("the paramenters is "+para);
                    break;
                 }
            case 2:
                
            System.out.println("enter the length  height");
            int length= in.nextInt();
            int breadth=in.nextInt();
           int rect = (int) (length*breadth);
            System.out.println("the area is "+rect);
            break;
            case 3:
            System.out.println("enter the side");
            int side= in.nextInt();
           int squ = (int) (side*side);
            System.out.println("the area is "+squ);
            break;
                
        }
    }
    

}
