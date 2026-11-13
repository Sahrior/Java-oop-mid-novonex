
// super keyword

class animal{

    String name;

    animal(String name){
        this.name = name;

        System.out.println("Animal constructor");
    }
}

class dog extends animal{
    
    dog(String name){
        super(name);
        System.out.println("Dog constructor");
    }
}


public class Recap11 {
    public static void main(String[] args) {

        dog d = new dog("daisy");

        System.out.println(d.name);
        
    }
    
}
