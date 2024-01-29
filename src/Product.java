public class Product {

    private String  ID;

    private String Name;

    private String Description;

    private double Cost;
    public Product(String ID, String name, String description, double cost) {
        this.ID = ID;
        Name = name;
        Description = description;
        Cost = cost;
    }
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public double getCost() {
        return Cost;
    }

    public void setCost(double cost) {
        Cost = cost;
    }
    public String productInfo(){
        return this.ID + ", " + this.getName() + " is described as " + this.getDescription() + " it costs $" + Cost;
    }
    public String toCSVDataRecord(){
        return this.ID + ", " + this.getName() + ", " + this.getDescription() + ", " + Cost;
    }
}
