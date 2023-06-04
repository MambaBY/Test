public class Dog extends Animal{

    private String breed;

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public Dog() {
    }

    public Dog(String name, String food, String location) {
        super(name, food, location);
    }

    @Override
    public void eat() {
        System.out.println("Dog" + getName() + " eats " + getFood());
    }

    @Override
    public void makeNoise() {
        System.out.println("Dogs say Woof-woof!");

    }
}
