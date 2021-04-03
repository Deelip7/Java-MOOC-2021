
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);

        PaymentCard paulsCard = new PaymentCard(20);
        PaymentCard mattsCard = new PaymentCard(30);


        paulsCard.eatHeartily();
        System.out.println("Paul: The card has a balance of " + paulsCard + " euros");

        mattsCard.eatAffordably();
        System.out.println("Matt: The card has a balance of " + mattsCard + " euros");

        paulsCard.addMoney(20);
        System.out.println("Paul: The card has a balance of " + paulsCard + " euros");

        mattsCard.eatHeartily();
        System.out.println("Matt: The card has a balance of " + mattsCard + " euros");

        paulsCard.eatAffordably();
        paulsCard.eatAffordably();
        System.out.println("Paul: The card has a balance of " + paulsCard + " euros");

        mattsCard.addMoney(50);
        System.out.println("Matt: The card has a balance of " + mattsCard + " euros");


    }
}
