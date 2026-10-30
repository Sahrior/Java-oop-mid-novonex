public class PassByValueDemo {

    static void changeNumber ( int number) {
        number = number - 500;

        System.out.println("Inside Method: " + number);

    }

    public static void main(String[] args) {
        
        int orginal = 1000;

        System.out.println("Before passing into method: " + orginal); // 1000 

        changeNumber(orginal); // 500

        System.out.println("After passing into method: " + orginal); // 1000




    }
    
}
