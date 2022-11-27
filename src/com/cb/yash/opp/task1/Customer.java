package com.cb.yash.opp.task1;

public class Customer extends Person{
    private String date_of_registration;
    private String delivery_address;
    private String contactno;
    private String email_id;

    public Customer(int pId, String pName, String pAddress, String dob) {
        super(pId, pName, pAddress, dob);
    }

    public String getDate_of_registration() {
        return date_of_registration;
    }

    public void setDate_of_registration(String date_of_registration) {
        this.date_of_registration = date_of_registration;
    }

    public String getDelivery_address() {
        return delivery_address;
    }

    public void setDelivery_address(String delivery_address) {
        this.delivery_address = delivery_address;
    }

    public String getContactno() {
        return contactno;
    }

    public void setContactno(String contactno) {
        this.contactno = contactno;
    }

    public String getEmail_id() {
        return email_id;
    }

    public void setEmail_id(String email_id) {
        this.email_id = email_id;
    }

    @Override
    public String toString(){
        return  "Id = \t"+ getpId()+ "\n"+
                "Name = \t"+ getpName()+ "\n"+
                "Address = \t"+ getpAddress()+ "\n"+
                "Dob = \t"+ getDob()+ "\n"+
                "Date_Of_Registration = \t"+ getDate_of_registration()+ "\n"+
                "Delivery Address  = \t"+ getDelivery_address()+ "\n"+
                "contactNo. = \t"+ getContactno()+ "\n"+
                "Email = \t"+ getEmail_id()+ "\n";
    }
}
