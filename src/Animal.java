public class Animal {
    private double weight;
    private int age;
    private String name;

    public Animal() {
    }

    public Animal(double weight, int age, String name) {
        this.weight = weight;
        this.age = age;
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void walk() {
        System.out.println("The animal is walking on the ground");
    }
}