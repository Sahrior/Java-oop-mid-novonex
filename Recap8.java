
// this keyword
class  student {
    String name;
    int id;


    student(){
        this("Sahrior", 101);
        System.out.println("No argument constructor");
    }

    student(String name, int id){
        this.name = name ;
        this.id = id;
        System.out.println("Parameterized constructor");
    }


}



public class Recap8 {
    public static void main(String[] args) {

        student s = new student();
        
    }
    
}



