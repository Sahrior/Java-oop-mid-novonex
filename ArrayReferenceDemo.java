public class ArrayReferenceDemo {

    public static void main(String[] args) {
        
        int[] first = {10,20,30};

        int[] second = first; // second = 10, 20, 30

        second[0] = 99; // second = 99, 20, 30

        System.out.println(second[0]); // 99

        System.out.println(first[0]);


    }
    
}
