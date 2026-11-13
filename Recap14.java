
// static block

class test{
    static int count;

    static {
        count = 10;
        System.out.println("Static block");
    }

    test(){
        System.out.println("constructor");
    }
}


public class Recap14 {
    public static void main(String[] args) {

        System.out.println("Main");

        test t1 = new test();
        test t2 = new test();
        
    }
}
