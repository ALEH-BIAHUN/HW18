public class Dog extends Animal{

    public Dog() {
    }

    public Dog(double weight, int age, String name) {
        super(weight, age, name);
    }

    @Override
    public void move() {
        System.out.println("The dog named " + super.getName() + " is running on the ground");
    }
}