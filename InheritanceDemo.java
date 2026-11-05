
class parent {

    // variable
    int parentVariable = 10;

    // constructor

    // method
    void parentMethod(){
        System.out.println("Parent Method");
    }
}

class child extends parent {

    int childVariable = 5;

    void childMethod(){

        parentMethod();

        System.out.println("Parent variable: "+parentVariable);

        System.out.println("Child Variable: "+childVariable);



    }

}



public class InheritanceDemo {

    public static void main(String[] args) {

        child child1 = new child();

        child1.childMethod();

        child1.parentMethod();
        
    }
    
}
