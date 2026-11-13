
// static method

class calculator{

    //method
    static int add(int a, int b){
        return  a+b;
    }

    int sub(int a, int b){
        return a-b;
    }
}



public class Recap13 {
    public static void main(String[] args) {

        calculator c = new calculator();

        System.out.println(calculator.add(10, 20));
        System.out.println(c.sub(20,10));
        
    }
}
