class calculator{

    int add(int a, int b){  // a = 5 , b = 10
        return a+b;  // 15
    }

    int add(int a, int b, int c){
        return a+b+c;
    }
    /*int add(float a, float b){  // a = 5.1 , b = 10.1
        return a+b;  // 15.2 = 15
    }*/
    double add(double a, double b, double c){
        return a+b+c;
    }
}
public class overload {
    public static void main(String[] args) {

        calculator c = new calculator();

        System.out.println(c.add(10, 5, 5));
        System.out.println(c.add(10, 5));
        System.out.println(c.add(5.5, 1.20, 3.2));
        
    }
}
