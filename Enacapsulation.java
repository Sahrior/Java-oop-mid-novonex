class bankAccount{

    private int balance;


    bankAccount(int balance){
        this.balance = balance;
    }

    // getter method = read 
    public int getBalance(){
        return balance;
    }

    // setter method = helps to write private variable

    public void setBalance(int amount){

        this.balance = this.balance + amount;

    }





    /*void deposit(int amount){
        balance = balance + amount;
    }*/

    void withdraw(int amount){
        balance = balance - amount;
    }

}

public class Enacapsulation {
    public static void main(String[] args) {

        bankAccount b1 = new bankAccount(5000);

        b1.withdraw(2000);

        System.out.println(b1.getBalance()); // 3000

        b1.setBalance(7000);


        System.out.println(b1.getBalance()); // 10000

        
        
    }
}
