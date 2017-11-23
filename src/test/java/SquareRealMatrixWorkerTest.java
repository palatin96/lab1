import org.junit.Test;

import static org.junit.Assert.*;

public class SquareRealMatrixWorkerTest {


    @Test
    public void testCalculateMeanValue() throws Exception {
        double[][] matrix =
                {{1.54, 2.43, 3.56},
                 {2.96, 5.32, 8.45},
                 {5.12, 7.45, 2.48}};

        SquareRealMatrixWorker squareRealMatrixWorker = new SquareRealMatrixWorker();
        double[] exp = {3.20666, 5.0666, 4.83};
        assertArrayEquals(exp, squareRealMatrixWorker.calculateMeanValue(matrix), 0.0001);

    }

    @Test(expected = EmptyMatrixException.class)
    public void testCalculateMeanValueWithEmptyMatrix() throws Exception {
        double[][] matrix = new double[0][0];
        SquareRealMatrixWorker squareRealMatrixWorker = new SquareRealMatrixWorker();
        squareRealMatrixWorker.calculateMeanValue(matrix);

    }

    @Test(expected = MatrixNotSquareException.class)
    public void testCalculateMeanValueWithNotSquareMatrix() throws Exception {
        double[][] matrix =
                {{1.54, 2.43, 3.56},
                 {2.96, 5.32, 8.45}};
        SquareRealMatrixWorker squareRealMatrixWorker = new SquareRealMatrixWorker();
        squareRealMatrixWorker.calculateMeanValue(matrix);

    }

    @Test
    public void testGetMaxElementFromCounterDiagonal() throws EmptyMatrixException, MatrixNotSquareException {
        double[][] matrix =
                {{1.54, 2.43, 3.56},
                 {2.96, 5.32, 8.45},
                 {5.12, 7.45, 2.48}};


        SquareRealMatrixWorker squareRealMatrixWorker = new SquareRealMatrixWorker();
        assertEquals(5.32, squareRealMatrixWorker.getMaxElementFromCounterDiagonal(matrix), 0);
    }

    @Test(expected = EmptyMatrixException.class)
    public void testGetMaxElementFromCounterDiagonalWithEmptyMatrix() throws EmptyMatrixException, MatrixNotSquareException {
        double[][] matrix = new double[0][0];


        SquareRealMatrixWorker squareRealMatrixWorker = new SquareRealMatrixWorker();
        squareRealMatrixWorker.getMaxElementFromCounterDiagonal(matrix);
    }

    @Test(expected = MatrixNotSquareException.class)
    public void testGetMaxElementFromCounterDiagonalWithNotSquareMatrix() throws EmptyMatrixException, MatrixNotSquareException {
        double[][] matrix =
                {{1.54, 2.43, 3.56},
                 {2.96, 5.32, 8.45}};


        SquareRealMatrixWorker squareRealMatrixWorker = new SquareRealMatrixWorker();
        squareRealMatrixWorker.getMaxElementFromCounterDiagonal(matrix);
    }



}