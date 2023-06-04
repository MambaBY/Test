public class Cat extends Animal{

    private String color;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }


    public Cat(){ }


    public Cat(String name, String food, String location) {
        super(name, food,location);
    }

    @Override
    public void eat() {
        System.out.println("Cat" + getName() + " eats " + getFood());

    }

    @Override
    public void makeNoise() {
        System.out.println("Cats say: Meeeooow!");

    }
}
