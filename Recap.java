
class student{

    // information = variable = instance variable
    String name;
    String id;
    double cgpa;

    // constructor

    student(String name, String id, double cgpa){
        this.name = name;
        this.id = id;
        this.cgpa = cgpa;
    }




    // function = method
    void enterUni(){
        System.out.println("Entered university");
    }

    void giveAttendance(){
        System.out.println("Attended uni");
    }


}



public class Recap{
    public static void main(String[] args){

        student s1 = new student("sahrior", "0112330078", 3.81);
        student s2 = new student("afifa" , "0112310320", 3.89);

        /*s1.name = "sahrior";
        s1.id = "0112330078";
        s1.cgpa = 3.81;

        s2.name = "afifa";
        s2.id = "0112310320";
        s2.cgpa = 3.89;*/

        System.out.println(s1.name);
        System.out.println(s2.name);

        s1.enterUni();



    }
}