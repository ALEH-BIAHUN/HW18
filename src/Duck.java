public class Duck extends Animal {

    public Duck() {
    }

    public Duck(double weight, int age, String name) {
        super(weight, age, name);
    }

    @Override
    public void move() {
        System.out.println("The duck named " + super.getName() + " is flying in the clouds");
    }
}