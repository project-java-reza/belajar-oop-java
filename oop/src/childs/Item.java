package childs;

import parents.ProductParent;

public class Item extends ProductParent {
   private int price;

    public Item() {

    }

    public Item(String name, int price) {
        super(name);
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public void printInformation() {
        System.out.println("Product Name : " + getName());
        System.out.println("Product Price : " + getPrice());
    }
}
