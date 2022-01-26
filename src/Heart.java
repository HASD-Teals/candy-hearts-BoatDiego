public class Heart {
    // PROPERTIES
    private String color;
    // Add remaining heart properties here...
    private int size;
    private int calories;
    private double cost;
    private boolean avaliable;
    private int stock;
    private String Saying;

    // CONSTRUCTORS
    public Heart() {
        this.color = "";
        this.size = 0;
        this.calories = 0;
        this.cost = 0;
        this.avaliable = false;
        this.stock = 0;
        this.Saying = "";
        ;

    } // This is the default contructor
      // Add overloaded Constructor here...

    /***
     * Uses to store Heart Properties
     * 
     * @param color
     * @param Saying
     * @param size
     * @param calories
     * @param costPerPound
     * @param avaliable
     * @param stock
     */
    public Heart(String color, String Saying, int size, int calories, double cost, boolean avaliable,
            int stock) {
        this.color = color;
        this.size = size;
        this.calories = calories;
        this.cost = cost;
        this.avaliable = avaliable;
        this.stock = stock;
        this.Saying = Saying;
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

    public double getCost() {
        return this.cost;
    }

    public boolean isAvaliable() {
        return this.avaliable;
    }

    public int getStock() {
        return this.stock;
    }

    public String Saying() {
        return this.Saying;
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

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setAvaliable(boolean avaliable) {
        this.avaliable = avaliable;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    // mutator method stuff
    public void adjPrice(int percentage) {
        this.cost += this.cost * (percentage / 100);
    }

    public void getSaying(String Saying) {
        this.Saying = Saying;
    }

    public void inStock() {
        if (this.stock > 0) {
            this.avaliable = true;
        }

    }

    // METHODS
    public String getReport() {
        String report = "Color is: " + this.color +
                "\nsize is: " + this.size + "\nSaying is: " + this.Saying + "\nAmount of Calories: " +
                this.calories + "\ncost: " + this.cost + "\navailability: " + this.avaliable
                + "\nIn Stock: " + this.stock;

        return report;
    }
    /**
     * Adjust Stocks at will while mainting positive values
     * @param stock
     */
    public void adjStock(int stock) {
        boolean available = false;
        if (stock >= 0) {
            this.stock = stock;
        }
        if (stock > 0) {
            this.stock = stock;
            available = true;

        }
        this.avaliable = available;
    }
    
    
}
