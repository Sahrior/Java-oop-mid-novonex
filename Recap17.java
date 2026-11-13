
// constructor execution order

class parent{
    static {
        System.out.println("parent static");
    }

    {
        System.out.println("Parent instance");
    }

    parent(){
        System.out.println("Parent constructor");
    }
}

class child extends parent{
    static {
        System.out.println("child statci");
    }
    {
        System.out.println("child instance");
    }
    child(){
        System.out.println("child constructor");
    }
}



public class Recap17 {
    public static void main(String[] args) {
        child c = new child();
    }
}
