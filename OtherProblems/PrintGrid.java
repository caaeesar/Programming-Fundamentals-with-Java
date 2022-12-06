package OtherProblems;

import java.util.Scanner;

public class PrintGrid {
    public static void main(String[] arguments) {
        Scanner scanner = new Scanner(System.in);

        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());

        int[][] arr = new int[rows][cols];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.print(arr[i][j]);
            }
            System.out.println();
        }                                 


    }
}
