
public class Student {

    // instance variable

    String name;
    String id;
    double cgpa;

    // 1st constructor

    /*Student ( String studentname, String studentid, double studentcgpa ){

        name = studentname;
        id = studentid;
        cgpa = studentcgpa;


    }*/

    Student ( String name, String id, double cgpa ){

        this.name = name;
        this.id = id;
        this.cgpa = cgpa;


    }


    // 2nd constructor

    Student (String sname , String sid ){
        name = sname;
        id = sid;
    }





    //Method
    public void result(int mark){
        if(mark > 55){
            System.out.println("Student passed");
        }else{
            System.out.println("Student failed");
        }
    }

    public static void main(String[] args) {
        
        Student s1 = new Student( "Sahrior" , "0112310203", 3.87  ); // called 1st constructor

        Student s2 = new Student("Afifa ", "0120303303"); // called 2nd constructor

        //s1.name = "sahrior";
        //s1.id = "0112330078";
        //s1.cgpa = 3.85;

        System.out.println(s1.name);
        System.out.println(s1.id);
        System.out.println(s1.cgpa);


    }
    
}
