// Abstract class Hero
public abstract class Hero {
    private String name;

    // Constructor
    public Hero(String name) {
        this.name = name;
    }

    // Method to display the hero's name
    public void display() {
        System.out.println("Aku adalah " + this.name);
    }
}
