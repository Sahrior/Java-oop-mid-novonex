
public class scope{

    int number; // instance variable

    scope( int number ){
        this.number = number;
    }





    public void hello( int n ){
        int x = 100;  // local variable + declared inside a method 

        System.out.println(x);
    }


    public static void main(String[] args) {

        scope s1 = new scope(50);

        System.out.println(s1.number);

        s1.hello( 23 );




        
        int a = 10;
        int b = 5;

        

        if( a > b ){
            int age = a - b;

            System.out.println(age);
        }

        

        //System.out.println(age);


    }



}