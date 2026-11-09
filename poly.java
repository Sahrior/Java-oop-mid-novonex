class animal{
    void makesound(){
        System.out.println("Animal makes sound");
    }
}
class dog extends animal{
    @Override 
    void makesound(){
        System.out.println("dog bark");
    }
}
class cat extends animal{
    @Override 
    void makesound(){
        System.out.println("cat says meow meow");
    }
}

public class poly {
    public static void main(String[] args) {
        animal a1 = new dog();
        animal a2 = new cat();

        //a1.makesound();
        //a2.makesound();

        System.out.println(a1 instanceof animal);
        System.out.println(a1 instanceof cat);

    }
    
}
