

public class MatrixNotSquareException extends Exception {


    public MatrixNotSquareException() {
        super("Matrix is not square");
    }

    public MatrixNotSquareException(String msg) {
        super(msg);
    }

}
