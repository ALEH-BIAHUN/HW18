public class Main {
    public static void main(String[] args) {
        Duck duck = new Duck(3.3, 5, "Utochka");
        duck.move();
        duck.walk();

        System.out.println("*******************************");

        Dog dog = new Dog(18.5, 8, "Druzok");
        dog.move();
        dog.walk();
    }
}