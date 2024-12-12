package kap8;

public class EmptyStringException extends Exception {
    public EmptyStringException() {
        super("Der Text ist leer!");
    }
}
