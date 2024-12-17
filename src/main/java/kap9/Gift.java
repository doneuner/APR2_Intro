package kap9;

public class Gift {

    private String giftNumber;
    private String giftName;

    public Gift(String giftNumber, String giftName) throws GiftNumberInvalidException, GiftNameInvalidException {
        setGiftNumber(giftNumber);
        setGiftName(giftName);
    }

    public void setGiftNumber(String giftNumber) throws GiftNumberInvalidException {
        if (giftNumber == null || giftNumber.length() < 10) {
            throw new GiftNumberInvalidException(giftNumber);
        }
        this.giftNumber = giftNumber;
    }

    public void setGiftName(String giftName) throws GiftNameInvalidException {
        if (giftName == null || giftName.length() < 1) {
            throw new GiftNameInvalidException();
        }
        this.giftName = giftName;
    }

    public String getGiftNumber() {
        return giftNumber;
    }

    public String getGiftName() {
        return giftName;
    }
}
