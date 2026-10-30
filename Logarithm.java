public class Logarithm {

    // instance variable b and x

    int b;
    double x;


    // constructor 1 for log1 object => (2,9)

    public Logarithm (int b, double x){
        this.b = b;
        this.x = x;
    }

    // constructor 2 for log 2 object => send another obect named log1 in constructor

    public  Logarithm (Logarithm log){
        this.b = log.b;
        this.x = log.x;
    }

    // constructor 3 for object 3 => default constructor

    public Logarithm (){
        this.b = 0;
        this.x = 0.0;
    }

    public double myfunc(){

        if(b==0 || x == 0){
            return 0.0;
        }

        return Math.log(x)/Math.log(b);



    }

    public static void main(String[] args) {
        
    }


    
}
