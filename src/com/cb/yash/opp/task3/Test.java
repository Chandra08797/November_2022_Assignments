package com.cb.yash.opp.task3;

public class Test {
    public static void main(String[] args) {
        Branch branch = new Branch();
        branch.setBranchId(123654);
        branch.setBranchName("HDFC");
        branch.setBranchAddress("Indore");

        Customer customer1 = new Customer();
        customer1.setCustId(101);
        customer1.setAccountNo("HDFC0002954");
        customer1.setBranchObj(branch);
        customer1.setCustName("ramaraj");
        customer1.setCustDob("15/06/1986");
        customer1.setCustAccountOpeningDate("12/05/2000");

        CustomerAccountStatement customerAccountStatement = new CustomerAccountStatement();
        customerAccountStatement.setCustAccStmtId(1122);
        customerAccountStatement.setCustomer(customer1);
        customerAccountStatement.setAmount(5000);
        customerAccountStatement.setDepositWithdrawl("deposit");

        System.out.println(customerAccountStatement);

    }
}
