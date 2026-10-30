public class ObjectParameterDemo {

    static void UpdateCgpa(students student){
        student.cgpa = 3.80;
    }

    public static void main(String[] args) {
        
        students s1 = new students("sahrior", 3.56);

        System.out.println("Before method: " + s1.cgpa);

        UpdateCgpa(s1);

        System.out.println("after method: " + s1.cgpa);





    }
    
}
