


public class SquareRealMatrixWorker {


    private boolean isMatrixSquare(double[][] matrix) {
        return matrix.length == matrix[0].length;
    }

    public double[] calculateMeanValue(double[][] matrix) throws MatrixNotSquareException, EmptyMatrixException {

        int size = matrix.length;

        if(size < 1)
            throw new EmptyMatrixException("Cannot calculate mean element for each columns because of empty matrix");

        if(!isMatrixSquare(matrix))
            throw new MatrixNotSquareException();


        double[] results = new double[size];

        for (int i = 0; i < size; i++) {
            for (double[] aMatrix : matrix) {
                results[i] += aMatrix[i];
            }
            results[i] /= size;
        }

        return results;
    }

    public double getMaxElementFromCounterDiagonal(double[][] matrix) throws EmptyMatrixException, MatrixNotSquareException {
        int size = matrix.length - 1;

        if(size < 0)
            throw new EmptyMatrixException("Cannot find max element from counter diagonal because of empty matrix");

        if(!isMatrixSquare(matrix))
            throw new MatrixNotSquareException();

        double max = matrix[size][size];

        for (int i = size; i > 0; i--) {
            if(matrix[size-i][i] > max)
                max = matrix[size-i][i];
        }

        return max;
    }


}
