package FirstMonth;

public class MatrixOperations {

    public static void main(String[] args) {
        int[][] matrixA=new int[3][3];
        int[][] matrixB=new int[3][3];
        int[][] result=new int[3][3];
        int sum=0;
        matrixA= new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        matrixB=new int[][]{{9, 8, 7}, {6, 5, 4}, {3, 2, 1}};


        System.out.println("Matrix A + Matrix B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print((matrixA[i][j] + matrixB[i][j]) + " ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println("Matrix A * Matrix B:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < 3; k++) {
                    sum+=matrixA[i][k]*matrixB[k][j];
                } result[i][j]=sum; 
                System.out.print(result[i][j]+ " ");
            }
            System.out.println();

        }
        System.out.println();

        System.out.println("Transpose of Matrix A: ");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrixA[j][i]+" ");
            } System.out.println();
        }

    }

}
