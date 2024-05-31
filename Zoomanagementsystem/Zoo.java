public class Zoo {
    public static void main(String[] args) {
        Lion lion = new Lion("Simba", 5);
        Elephant elephant = new Elephant("Rani", 10);
        Monkey monkey = new Monkey("Mango", 3);

        System.out.println("Lion:");
        lion.makeSound();
        lion.eat();

        System.out.println("\nElephant:");
        elephant.makeSound();
        elephant.eat();

        System.out.println("\nMonkey:");
        monkey.makeSound();
        monkey.eat();

        // Testing overloaded methods
        System.out.println("\nLion making sound 3 times:");
        lion.makeSound(3);

        System.out.println("\nElephant eating fruits:");
        elephant.eat("fruits");
    }
}