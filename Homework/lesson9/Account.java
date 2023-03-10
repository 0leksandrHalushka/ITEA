package lesson9;

public class Account {

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    private String accountName;
    private AccountOperation accountOperation;

    private class AccountOperation{

        private int withdrawal;
        private int replenishment;
        private int payment;

        public void setWithdrawal(int withdrawal) {
            this.withdrawal = withdrawal;
        }

        public void setReplenishment(int replenishment) {
            this.replenishment = replenishment;
        }

        public void setPayment(int payment) {
            this.payment = payment;
        }
        private String operationInfo(){
            return "withdrawal: " + withdrawal + " | replenishment: " + replenishment + " | payment: " + payment;
        }

    }

    public void setAccount(int withdrawal, int replenishment, int payment){
        accountOperation = new AccountOperation();
        accountOperation.setWithdrawal(withdrawal);
        accountOperation.setReplenishment(replenishment);
        accountOperation.setPayment(payment);
    }

    @Override
    public String toString() {
        return "Account {" +
                "accountName = '" + accountName + '\'' +
                ", accountOperation = " + accountOperation.operationInfo() +
                " }";
    }
}
