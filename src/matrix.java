public class matrix
{
    public static double sumMajorDiagonal(double[][] matrix)
    {
        if(matrix.length != matrix[0].length)
            return Integer.MIN_VALUE;

        int sum = 0;
        for(int i = 0; i < matrix.length; i++)
            sum += matrix[i][i];

        return sum;
    }

    public static double sumMinorDiagonal(double[][] matrix)
    {
        if(matrix.length != matrix[0].length)
            return Integer.MIN_VALUE;

        int sum = 0;
        int j = matrix[0].length;
        for(int i = 0; i < matrix.length; i++)
        {
            j--;
            sum += matrix[i][j];
        }
        return sum;
    }

    //public static double[][] transpose(double[][] matrix)
    {

    }

    public static boolean isMatrix(double[][] matrix)
    {
        if()
    }
}
