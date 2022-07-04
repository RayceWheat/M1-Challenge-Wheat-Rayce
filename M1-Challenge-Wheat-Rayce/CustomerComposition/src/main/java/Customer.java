public class Customer {

    private String Firstname;

    private String Lastname;

    private String Email;

    private String Phonenumber;

    private ShippingAddress shippingAddress;

    private BillingAddress billingAddress;

    private boolean rewardsMember;

    public String getFirstname() {
        return Firstname;
    }

    public void setFirstname(String firstname) {
        Firstname = firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public void setLastname(String lastname) {
        Lastname = lastname;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhonenumber() {
        return Phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        Phonenumber = phonenumber;
    }

    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    public void setShippingAddress(ShippingAddress shippingAddress) {
        this.shippingAddress = shippingAddress;
    }

    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    public void setBillingAddress(BillingAddress billingAddress) {
        this.billingAddress = billingAddress;
    }

    public boolean isRewardsMember() {
        return rewardsMember;
    }

    public void setRewardsMember(boolean rewardsMember) {
        this.rewardsMember = rewardsMember;
    }

    public Customer(String firstname, String lastname, String email, String phonenumber, ShippingAddress shippingAddress, BillingAddress billingAddress, boolean rewardsMember) {
        Firstname = firstname;
        Lastname = lastname;
        Email = email;
        Phonenumber = phonenumber;
        this.shippingAddress = shippingAddress;
        this.billingAddress = billingAddress;
        this.rewardsMember = rewardsMember;
    }


}
