// Main class to demonstrate inheritance from abstract class
public class Abstraction {
    public static void main(String[] args) {
        // Creating objects from non-abstract subclasses
        HeroIntel hero1 = new HeroIntel("Rayhan");
        hero1.display();  // Outputs: Aku adalah Otong

        HeroAgility hero2 = new HeroAgility("Mario");
        hero2.display();  // Outputs: Aku adalah Mario

        // Creating an object from the abstract class is not allowed
        // Hero hero3 = new Hero("Mario"); // This line is commented out because it would cause an error
        // hero3.display();
    }
}
