import java.util.Arrays;
import java.util.Scanner;
public class additionofarray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                arr[i][j] =sc.nextInt();
            }
        }
            int[][] arr1 = new int[3][3];
            for (int c = 0; c < 3; c++) {
                for (int j = 0; j < 3; j++) {
                    arr1[c][j] = sc.nextInt();
                }
            }
                int[][] arr2 = new int[3][3];

                for (int a = 0; a < 3; a++) {
                    for (int j = 0; j < 3; j++) {
                        arr2[a][j] = arr[a][j] + arr1[a][j];
                    }
                }
         
                for(int i=0;i<3;i++){
                    for(int j=0;j<3;j++){
                        System.out.print(arr[i][j]+"+"+arr1[i][j]+"="+arr2[i][j]+" ");
                    }
                    System.out.println();
                }
                 

            }
        }
    