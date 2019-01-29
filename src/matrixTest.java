public class matrixTest
{
    public static void main(String[] args)
    {
        double[][] mat = new double[3][3];
        mat[0][0] = 5; mat[0][1] = 2; mat[0][2] = 5;
        mat[1][0] = 4; mat[1][1] = 3; mat[1][2] = 9;
        mat[2][0] = 9; mat[2][1] = 1; mat[2][2] = 8;

        toString(mat);
        System.out.println("Major Diagonal length: 16. Calculated length: " + matrix.sumMajorDiagonal(mat));
        System.out.println("Minor Diagonal length: 17. Calculated length: " + matrix.sumMinorDiagonal(mat));
        System.out.println();

        mat = matrix.transpose(mat);
        toString(mat);
    }

    public static void toString(double[][] matrix)
    {
        for(int r = 0; r < matrix.length; r++)
        {
            for(int c = 0; c < matrix[0].length; c++)
                System.out.print(" | " + matrix[r][c]);
            System.out.print(" |");
            System.out.println();
        }
        System.out.println();
    }
}
