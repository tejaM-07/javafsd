class Bankaccount {
    private double balance;

    public void setBalance(double balance){
        if (balance < 0) {
            System.out.println("Invalid balance. Please enter a positive value.");
        } else {
            this.balance = balance;
            System.out.println("Balance set to: " + this.balance);

        }
    }
    public double getBalance() {
        return this.balance;
    }
 }