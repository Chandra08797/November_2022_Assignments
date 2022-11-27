package com.cb.yash.opp.task3;

public class Customer {
    private int custId;
    private String accountNo;
    private String custName;
    private String custAddress;
    private String custDob;
    private String custAccountOpeningDate;
    private Branch branchObj;

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }

    public String getCustDob() {
        return custDob;
    }

    public void setCustDob(String custDob) {
        this.custDob = custDob;
    }

    public String getCustAccountOpeningDate() {
        return custAccountOpeningDate;
    }

    public void setCustAccountOpeningDate(String custAccountOpeningDate) {
        this.custAccountOpeningDate = custAccountOpeningDate;
    }

    public Branch getBranchObj() {
        return branchObj;
    }

    public void setBranchObj(Branch branchObj) {
        this.branchObj = branchObj;
    }

    @Override
    public String toString(){
        return  "cId = \t"+ getCustId()+ "\n"+
                "Name = \t"+ getCustName()+ "\n"+
                "Address = \t"+ getCustAddress()+ "\n"+
                "Dob = \t"+ getCustDob()+ "\n"+
                "Account = \t"+ getAccountNo()+ "\n"+
                "Acc Opening Date  = \t"+ getCustAccountOpeningDate()+ "\n\n"+
                "\t\t\tBRACH DETAILS ARE\n\n"+
                "BrachId = \t"+ getBranchObj().getBranchId()+ "\n"+
                "BranchName = \t"+ getBranchObj().getBranchName()+ "\n"+
                "BranchAddress = \t"+ getBranchObj().getBranchAddress()+ "\n";
    }
}
