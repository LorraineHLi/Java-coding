public class NbyN {
    public static int[][] nbyn(int N) {
        int[][] mat = new int[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == j) mat[i][j] = i;
                else mat[i][j] = 0;
            }
        }
        return mat;
    }

    public static void main(String[] args) {
        int[][] mat = nbyn(10);
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}
