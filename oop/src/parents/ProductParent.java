package parents;

public abstract class ProductParent {
    private String name;

    public ProductParent() {

    }

    public ProductParent(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // abstract method
    public abstract void printInformation();
}
