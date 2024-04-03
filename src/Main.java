public class Main {
    public static void main(String[] args) {
        int[][] matrix;
        int kStrok = 6;
        int kStolb = 7;
        matrix = new int[kStrok][kStolb];
        printMatr(matrix);

        matrix = generateRandomMatrix(5, 5);
        printMatr(matrix);
    }

    public static void printMatr(int[][] matr){
        for (int i = 0; i < matr.length; i++) {
           // int[] stroka = matr[i];
           // printArray("строка матрицы ", stroka);
            for (int j = 0; j <  matr[i].length; j++) {
                //System.out.print( matr[i][j]+" ");
                System.out.printf("%4d", matr[i][j]);   //форматируем для красивых ровных столбцов
            }
            System.out.println();
        }
    }

    private static void printArray(String message, int[] massiv) {
        System.out.println(message +" "+ massiv.length + " чисел");
        for (int i = 0; i < massiv.length; i++) {
            System.out.print(massiv[i]+" ");

        }
        System.out.println();
    }

    public static int[][] generateRandomMatrix(int kRow, int kCol){
        int[][] matrix=new int[kRow][kCol];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j <  matrix[i].length; j++) {
                matrix[i][j] = (int) (Math.random() * 100);
            }
        }
        return matrix;
    }
}