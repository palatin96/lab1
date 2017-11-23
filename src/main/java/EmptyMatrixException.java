
public class EmptyMatrixException extends Exception {

    public EmptyMatrixException() {
        super("Matrix is empty");
    }

    public EmptyMatrixException(String msg) {
        super(msg);
    }
}
