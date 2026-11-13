
// constructor overloading
class student{

    // instance variable
    String name;
    String id;
    double cgpa;
    // constructor 1
    student (String name, String id, double cgpa){
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }
    // constructor 2
    student (String name, String id){
        this.name = name;
        this.id = id;
    }
    // constructor 3
    student(){
        this.name = "unknwon";
        this.id = "0";
        this.cgpa = 0;
    }
    void display(){
        System.out.println(name + " " + id + " " + cgpa);
    }

}
public class Recap7 {

    public static void main(String[] args) {

        student s1 = new student();
        student s2 = new student("maruf", "0112330090");
        student s3 = new student("sahrior", "0112330078", 3.81);

        s1.display();
        s2.display();
        s3.display();
        
    }
    
}
