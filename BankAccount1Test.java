public class BankAccount1Test {

    public static void main(String[] args) {
        
        BankAccount1 user = new BankAccount1();

        System.out.println("Initial balance: " + user.getbalance());

        user.setbalance(1000);

        System.out.println("Updated balance: " + user.getbalance());



    }
    
}
