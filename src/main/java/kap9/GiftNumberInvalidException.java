package kap9;

public class GiftNumberInvalidException extends Exception {

    private String value;

    public GiftNumberInvalidException(String value) {
        super();
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "GiftNumberInvalidException{" +
                "invalidValue='" + value + '\'' +
                '}';
    }
}
