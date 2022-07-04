public class BillingAddress {

    private String Street1;

    private String Street2;

    private String City;

    private String State;

    private int Zipcode;

    public String getStreet1() {
        return Street1;
    }

    public void setStreet1(String street1) {
        Street1 = street1;
    }

    public String getStreet2() {
        return Street2;
    }

    public void setStreet2(String street2) {
        Street2 = street2;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String city) {
        City = city;
    }

    public String getState() {
        return State;
    }

    public void setState(String state) {
        State = state;
    }

    public int getZipcode() {
        return Zipcode;
    }

    public void setZipcode(int zipcode) {
        Zipcode = zipcode;
    }

    public BillingAddress(String street1, String street2, String city, String state, int zipcode) {
        Street1 = street1;
        Street2 = street2;
        City = city;
        State = state;
        Zipcode = zipcode;
    }
}
