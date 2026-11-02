public class acessModifierTest {

    public static void main(String[] args) {
        

        accessModifierDemo obj = new accessModifierDemo();

        System.out.println(obj.publicName);

        //System.out.println(obj.privateName); cannot access private variable outside its own class so this line will give error

        obj.publicMethod();

        // this line will give error because we cannot acess priavte method outside its own class
        //obj.privateMethod();


    }
    
}
