import java.util.Arrays;
import java.util.Scanner;

public class arrayuser {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int[] arr = new int[5];
        for(int i=0;i<5;i++){
            arr[i] = in.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        int[][] arr2 = new int[3][3];
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                arr2[i][j] = in.nextInt();
            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }
        

    }

}
