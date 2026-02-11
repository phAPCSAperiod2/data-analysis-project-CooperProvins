public class Cereal {
    private String name;
    private char manufacturer;
    private char type;
    private int calories;
    private int fiber;
    private int carbs;
    private int sugars;
    private int potassium;
    private double rating;

    public Cereal(String name, char manufacturer, char type, int calories, int fiber, int carbs, int sugars, int potassium, double rating){
        this.name = name;
        this.manufacturer = manufacturer;
        this.type = type;
        this.calories = calories;
        this.fiber = fiber;
        this.carbs = carbs;
        this.sugars = sugars;
        this.potassium = potassium;
        this.rating = rating;
    }
    public String getName() {
        return name;
    }
    public int getCalories() {
        return calories;
    }
    public int getCarbs() {
        return carbs;
    }
    public int getFiber() {
        return fiber;
    }
    public char getManufacturer() {
        return manufacturer;
    }
    public int getPotassium() {
        return potassium;
    }
    public double getRating() {
        return rating;
    }
    public int getSugars() {
        return sugars;
    }
    public char getType() {
        return type;
    }
}