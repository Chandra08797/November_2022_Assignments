package com.cb.yash.opp.task3;

public class CustomerAccountStatement {
    private int custAccStmtId;
    private Customer customer;
    private int amount;
    private String depositWithdrawl;
    private String depositWithdralDate;

    public int getCustAccStmtId() {
        return custAccStmtId;
    }

    public void setCustAccStmtId(int custAccStmtId) {
        this.custAccStmtId = custAccStmtId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getDepositWithdrawl() {
        return depositWithdrawl;
    }

    public void setDepositWithdrawl(String depositWithdrawl) {
        this.depositWithdrawl = depositWithdrawl;
    }

    public String getDepositDate() {
        return depositWithdralDate;
    }

    public void setDepositDate(String depositWithdralDate) {
        this.depositWithdralDate = depositWithdralDate;
    }

    @Override
    public String toString(){
        return  "\t\t\tAccount Holder Details\n\n"+
                getCustomer().toString() +
                "\n\t\t\tStatementDetails\n\n"+
                "StmtId = \t"+ getCustAccStmtId()+ "\n"+
                "Amount = \t"+ getAmount()+ "\n"+
                "deposit/withdraw = \t"+ getDepositWithdrawl()+ "\n"+
                "deposit/withdraw date = \t"+ getDepositDate()+ "\n";

    }
}
