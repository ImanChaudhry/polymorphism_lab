public abstract class Vehicle {

    private String type;
    private int size;

    public Vehicle (String type, int size){
        this.type = type;
        this.size = size;
    }

    public String getType() {
        return this.type;
    }

    public int getSize() {
        return this.size;
    }

    public String speed() {
        return this.type + "is fast";
    }

    public String shape() {
        return this.type + "is round";
    }

    public boolean getIsFunction() {
        return false;
    }
}
