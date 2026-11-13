

//super keyword
class animal{

    void makesound(){
        System.out.println("Animal makes sound");
    }
}

class dog extends animal{
    @Override 
    void makesound(){
        System.out.println("Dog barks");
        super.makesound();
    }
}



public class Recap10 {
    public static void main(String[] args) {

        dog d = new dog();

        d.makesound();
        
    }
}
