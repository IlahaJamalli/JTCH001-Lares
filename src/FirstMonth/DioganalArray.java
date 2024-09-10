package FirstMonth;

public class DioganalArray {

    public static void main(String[] args) {
        char[][] matrix={
                {'A', 'B', 'C'},
                {'D', 'E', 'F'},
                {'G', 'H', 'I'}
        };

        // 00 11 22
        // 02 11 20
        System.out.println("Matrix: ");
        for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }

        //00 11 22
        System.out.println("First dioganal: ");
        for (int i = 0; i < matrix.length ; i++) {
                System.out.print(matrix[i][i]);

        }
        System.out.println("Second dioganal: ");

            for (int i = 0; i < matrix.length ; i++) {
                System.out.print(matrix[i][matrix.length-1-i]);
            } System.out.println();
        }



}
