public class PaymentCard {

    private double balance;

    public PaymentCard(double balance) {
        this.balance = balance;
    }

    public String toString() {
        return "The card has a balance of " + balance + " euros"
                ;
    }

    public void eatAffordably() {
        if (this.balance >= 2.60) {
            this.balance -= 2.60;
        }
    }

    public void eatHeartily() {
        if (this.balance >= 4.60) {
            this.balance -= 4.60;
        }
    }

    public void addMoney(double amount) {
        if (amount >= 0) {
            if (this.balance + amount >= 150) {
                this.balance += amount - (amount - 150 + balance);
            } else {
                this.balance += amount;
            }

        }

    }

}
