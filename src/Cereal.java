public class Cereal {
    private String name;
    private char manufacturer;
    private char type;
    private int calories;
    private int protein;
    private int fat;
    private int sodium;
    private double fiber;
    private double carbs;
    private int sugars;
    private int potassium;
    private double rating;

    public Cereal(String name, char manufacturer, char type, int calories, int protein, int fat, int sodium, double fiber, double carbs, int sugars, int potassium, double rating){
        this.name = name;
        this.manufacturer = manufacturer;
        this.type = type;
        this.calories = calories;
        this.protein = protein;
        this.fat = fat;
        this.sodium = sodium;
        this.fiber = fiber;
        this.carbs = carbs;
        this.sugars = sugars;
        this.potassium = potassium;
        this.rating = rating;
    }
    @Override
    public String toString() {
        String returnString = "";
        returnString += name + " {";
        returnString += "\n\tManufacturer: " + manufacturer;
        returnString += "\n\tType: " + type;
        returnString += "\n\tCalories: " + calories;
        returnString += "\n\tProtein: " + protein;
        returnString += "\n\tFat: " + fat;
        returnString += "\n\tSodium: " + sodium;
        returnString += "\n\tFiber: " + fiber;
        returnString += "\n\tCarbohydrates: " + carbs;
        returnString += "\n\tSugars: " + sugars;
        returnString += "\n\tPotassium: " + potassium;
        returnString += "\n\tRating: " + rating;
        returnString += "\n}";
        return returnString;
    }
    public String getName() {
        return name;
    }
    public int getCalories() {
        return calories;
    }
    public double getCarbs() {
        return carbs;
    }
    public double getFiber() {
        return fiber;
    }
    public char getManufacturer() {
        return manufacturer;
    }
    public int getPotassium() {
        return potassium;
    }
    public int getFat() {
        return fat;
    }
    public int getProtein() {
        return protein;
    }
    public int getSodium() {
        return sodium;
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