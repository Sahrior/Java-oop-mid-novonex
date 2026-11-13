// method overloading
// same name - inside in same class
// diffrent number of parameter
// diffrent type of parameter 

class calculator{

    int add (int a, int b){
        return a+b;
    }

    int add ( int a, int b, int c ){
        return a+b+c;
    }

    double add ( double a,  double b){
        return a+b;
    }

}



public class Recap5 {

    public static void main(String[] args) {

        calculator  c = new  calculator();

        System.out.println(c.add(10,20));
        System.out.println(c.add(10,20,30));
        System.out.println(c.add(10.5, 20.5));
        
    }
    
}
