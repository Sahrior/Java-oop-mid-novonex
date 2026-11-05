class person {

    String name;
    int age;
    String address;

}

class student extends person {

    double cgpa;

    public void studentmethod(){
        System.out.println("i am a student");
    }

}

class teacher extends person {

    double salary;

    public void teachermethod(){
        System.out.println("i am a teacher");
    }

}

class staff extends person {

    String work;

    public void staffmethod(){
        System.out.println("i am a staff");
    }

}



public class HierarchicalInheritance {
    public static void main(String[] args) {
        
    }
}
