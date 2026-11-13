
// super keyword

class animal{

    String name = "Animal";
}

class dog extends animal{
    String name = "DOG";

    void display(){
        System.out.println(name);
        System.out.println(super.name);
    }
}

public class Recap9 {
    public static void main(String[] args) {
        dog d = new dog();

        d.display();
        
    }
    
}





