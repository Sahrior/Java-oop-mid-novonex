
class Animal {
    public String color;
    public String name;

    Animal(){
        System.out.println("Default constructor");
    }

    public Animal(String color, String name) {
        this.color = color;
        this.name = name;
    }



    public void showNameColor() {
        System.out.println("Color is: " + color + " Name is: " + name);
    }


}

class Pokemon extends Animal {
    public String name = "Pikachu";
    public String color = "Red";


}

public class AnimalTest {
    public static void main(String[] args) {
        Animal defaultAnimal = new Animal(  "dark yellow" , "raichu"  );
        Animal pk = new Pokemon();

        defaultAnimal.showNameColor();
        pk.showNameColor();
    }
}