
class parent{
    String name = "UIU";

    // write a parent method

    void display(){
        System.out.println("i am parent");
    }
}

class child extends parent {
    String name = "sahrior";

    void display(){
        System.out.println("Child name is: " + name); 
        System.out.println("parent name is: " + super.name); // accessing variable using super keyword

        // access the parent method using super keyword
        super.display();
    }

    

    
}



public class superDemo {

    public static void main(String[] args) {

        child c = new child();

        c.display();
        
    }
    
}
