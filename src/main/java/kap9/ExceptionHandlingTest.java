package kap9;

public class ExceptionHandlingTest {

    public static void main(String[] args) {

        // valid
        try {
            Gift ps5 = new Gift("0000000001", "PS5");
        } catch (GiftNumberInvalidException | GiftNameInvalidException e) {
            System.out.println(e);
        }

        // invalid number, show tostring
        try {
            Gift ps5 = new Gift("000000001", "PS5");
        } catch (GiftNumberInvalidException e) {
            System.out.println(e);
        } catch (GiftNameInvalidException e) {
            System.out.println(e);
        }

        // invalid name, print stacktrace
        try {
            Gift ps5 = new Gift("0000000001", "");
        } catch (GiftNumberInvalidException e) {
            System.out.println(e);
        } catch (GiftNameInvalidException e) {
            e.printStackTrace();
        }


    }
}
