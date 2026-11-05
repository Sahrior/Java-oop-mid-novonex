
class animal {

    void eat(){
        System.out.println("animal is eating ");
    }

}

class dog extends animal{
    void bark(){
        System.out.println("dog is barking");
    }
}

class puppy extends dog{
    void sleep(){
        System.out.println("puppy is sleeping");
    }
}



public class MultiLevelInheritance {

    public static void main(String[] args) {

        puppy p = new puppy();
        p.eat();
        p.bark();
        p.sleep();

        dog d = new dog();
        d.eat();
        d.bark();
        
        //d.sleep(); error because sleeep method is not in the parent method of dog class
        
    }

    
}