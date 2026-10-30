

public class BankAccount {

    // Instance variable

    String name;
    double balance;

    // default constructor

    BankAccount(){
        this.name = "null";
        this.balance = 0.0;
    }

    // Method 

    public void deposit(double amount){
        balance = balance + amount;
    }

    // Main method
    public static void main(String[] args) {
        
        BankAccount accountR = new BankAccount();
        BankAccount accountK = new BankAccount();

        /*accountR.name =  "rahim";
        accountR.balance = 1000;

        accountK.name = "kashem";
        accountK.balance = 1000;


        accountR.deposit(2000.00); */

        

        System.out.println("Balance of rahim: " + accountR.balance + " " + accountR.name);
        System.out.println("Blance of kashem: "+ accountK.balance + " "  + accountK.name);





    }

    

}
