public class Heart {
    // PROPERTIES
    private String color;
    // Add remaining heart properties here...
    private int size;
    private int calories;
    private double costPerPound;
    private boolean avaliable;
    private int stock;

    // CONSTRUCTORS
    public Heart() {
        this.color = "";
        this.size = 0;
        this.calories = 0;
        this.costPerPound = 0;
        this.avaliable = false;
        this.stock = 0;
        ;

    } // This is the default contructor
      // Add overloaded Constructor here...

    public Heart(String color, int size, int calories, double costPerPound, boolean avaliable, int stock) {
        this.color = color;
        this.size = size;
        this.calories = calories;
        this.costPerPound = costPerPound;
        this.avaliable = avaliable;
        this.stock = stock;
    }

    // ACCESSORS
    public String getColor() {
        return this.color;
    }

    // Add remaining Accessor methods here...
    public int getSize() {
        return this.size;
    }

    public int getCalories() {
        return this.calories;
    }

    public double getCostPerPound() {
        return this.costPerPound;
    }

    public boolean isAvaliable() {
        return this.avaliable;
    }

    public int getStock() {
        return this.stock;
    }

    // MUTATORS
    public void setColor(String color) {
        this.color = color;

    }

    // Add remaining Mutator methods here...
    public void setSize(int size) {
        this.size = size;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

    public void setCostPerPound(double costPerPound) {
        this.costPerPound = costPerPound;
    }

    public void setAvaliable(boolean avaliable) {
        this.avaliable = avaliable;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // mutator method stuff
    public void adjPrice(int percentage) {
        this.costPerPound += this.costPerPound * (percentage / 100);
    }

    public void inStock() {
        if (this.stock > 0) {
            this.avaliable = true;
        }

    }

    // METHODS
    public String getReport() {
        String report = "Color is :" + this.color + "\n size is: " + this.size + "\nAmount of Calories: " +
                this.calories + "\ncost per pound:" + this.costPerPound + "\navailability: " + this.avaliable
                + "\nIn Stock: " + this.stock;

        return report;
    }
}
