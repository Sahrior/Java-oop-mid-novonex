class bankAccount{

    private int balance;

    // getter
    // 1. access modifier must be public
    // 2. return type = private variable data type
    // 3. parameter = no parameter
    public int getBalance(  ){
        return balance;
    }

    // setter
    // 1. access modifier must be public
    // 2. return type = alwys void
    // 3. parament = not empty
    public void setBalance(int amount){
        this.balance = amount;
    }




    void deposit(int amount){
        balance = balance + amount;
    }
    void withdraw(int amount){
        balance = balance - amount;
    }


}

public class Recap4 {

    public static void main(String[] args) {
        
        bankAccount b1 = new bankAccount();

        //b1.balance = 5000; // write balacne 
        b1.setBalance(5000);
        //System.out.println(b1.balance); // balance read
        System.out.println(b1.getBalance());
        //b1.balance = 2000; // write balacne 
        b1.setBalance(2000);
        //System.out.println(b1.balance); // balance read
        System.out.println(b1.getBalance());
        
    }
    
}
