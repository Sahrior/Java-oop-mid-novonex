
// final variable 

class student{
    final int id = 101;

    void display(){
        System.out.println(id);
    }
}

public class Recap15 {
    public static void main(String[] args) {

        student s = new student();

        //s.id = 102; error dibe

        s.display();
        
    }
}
