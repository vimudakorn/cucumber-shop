package ku.shop;

public class NotEnoughStockException extends Exception {
    public NotEnoughStockException() {}
    public NotEnoughStockException(String reason) {
        super(reason);
    }
}