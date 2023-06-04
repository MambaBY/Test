public class Horse extends Animal{
    private double weight;
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Horse() {
    }

    public Horse(String name, String food, String location) {
        super(name, food, location);
    }

    @Override
    public void eat() {
        System.out.println("Horse " + getName() + " eats " + getFood());

    }

    @Override
    public void makeNoise() {
        System.out.println("Horses say: Yeah!Yeah!!");

    }
}
