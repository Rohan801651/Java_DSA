package Matrix;

import java.util.Scanner;

public class Matrices {

    Scanner sc = new Scanner(System.in);
    private int[][] matrix1;
    private int[][] matrix2;
    private int[][] result;

    public Matrices(int length) {
        this.matrix1 = new int[length][length];
        this.matrix2 = new int[length][length];
        this.result = new int[length][length];
    }

    public String displayTwoByTwoMatrixIndexes() {
        return "0,0 \t0,1\n1,0 \t1,1";
    }

    public void AddMatrices() {
        System.out.println("Enter Values of Matrix 1 :");
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1.length; j++) {
                System.out.print("Enter Value at "+i+", "+j+":\t");
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter values of Matrix 2 :");
        for (int i = 0; i < matrix2.length; i++) {
            for (int j = 0; j < matrix2.length; j++) {
                System.out.print("Enter Value at "+i+", "+ j+":\t");
                matrix2[i][j] = sc.nextInt();
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Calculating Result...");
        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
//                result[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(result[i][j]+"\t");
            }
            System.out.println();
        }

    }




}
