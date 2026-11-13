
// method overriding
// in inheritance method overriding can appear

class animal{

    String animalName;

    void makeSound(){
        System.out.println("animal makes sound");
    }
}

class dog extends animal{

    @Override 
    void makeSound(){
        System.out.println("dog barks");
    }
}
public class Recap6 {
    public static void main(String[] args) {

        animal a1 = new dog();

        a1.makeSound();//
        
    }
    
}
