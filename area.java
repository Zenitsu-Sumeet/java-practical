import java.util.Scanner;

import javafx.scene.transform.Scale;

class area{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("1.circle");
        System.out.println("2 rectangles");
        System.out.println("3 sqaure");
        int a = in.nextInt();

      
        switch(a){
            case 1:
                 System.out.println("enter the radius");
                int radius= in.nextInt();
               int sum = (int) (3.14*(radius*radius));
                System.out.println("the area is "+sum);
                break;
            case 2:
                
            System.out.println("enter the length width and height");
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