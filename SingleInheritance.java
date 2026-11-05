
class animal {

    void eat(){
        System.out.println("animal is eating ");
    }

    void sleep(){
        System.out.println("animal is sleeping");
    }


}

class dog extends animal{
    void bark(){
        System.out.println("dog is barking");
    }
}


public class SingleInheritance {

    public static void main(String[] args) {

        dog d = new dog();

        d.eat();
        d.sleep();
        d.bark();
        
    }
    
}
