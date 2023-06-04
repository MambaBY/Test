public abstract class Animal {

    private String name;
    private String food;
    private String location;

    public Animal() {

    }

    public Animal(String name, String food, String location) {
        this.name = name;
        this.food = food;
        this.location = location;
    }


    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }





    public abstract void eat();
    public abstract void makeNoise();

    public void sleep(){
        System.out.println("Animal " + name + " is sleeping.");

    }





}
