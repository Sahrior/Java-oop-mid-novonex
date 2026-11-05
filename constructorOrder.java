class a{
    a(){
        System.out.println("Inside a's constructor");
    }
}

class b extends a{
    b(){
        System.out.println("Inside b's constructor");
    }
}

class c extends b{
    c(){
        System.out.println("Inside c's constructor");
    }
}




public class constructorOrder {

    public static void main(String[] args) {

        c obj = new c();
        
    }
    
}
