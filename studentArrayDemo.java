public class studentArrayDemo {

    public static void main(String[] args) {
        
        StudentNew[] students = new StudentNew[3];

        students[0] = new StudentNew("sahrior", 3.85);
        students[1] = new StudentNew("afifa", 3.87);
        students[2] = new StudentNew("maruf", 2.12);

        for( int i = 0; i<students.length; i++ ){
            students[i].display();
        }



        



    }
    
}
