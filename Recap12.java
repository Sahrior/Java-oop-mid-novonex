
//static variable

class student{

    String name;
    static String university_name = "UIU" ;

    student(String name){
        this.name = name;
    }
}


public class Recap12 {
    public static void main(String[] args) {

        student s1 = new student("sahrior");
        student s2 = new student("afifa");
        student s3 = new student("maruf");
        student s4  = new student("nazmoon");

        System.out.println(s1.name + " " + s2.name + " " + s3.name + " " + s4.name);
        System.out.println(s1.university_name + " " + s2.university_name + " " + s3.university_name + " " + s4.university_name);
    }
}
