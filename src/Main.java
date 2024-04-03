public class Main {
    public static void main(String[] args) {
        int[][] matrix;
        int kStrok = 6;
        int kStolb = 7;
        matrix = new int[kStrok][kStolb];
        printMatr(matrix);
    }

    public static void printMatr(int[][] matr){
        for (int i = 0; i < matr.length; i++) {
           // int[] stroka = matr[i];
           // printArray("строка матрицы ", stroka);
            for (int j = 0; j <  matr[i].length; j++) {
                System.out.print( matr[i][j]+" ");
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
}