package eu.kasprzaksolutions.thymetest.domain;

public class Product {

    private String description;
    private int size;

    public Product(String description, int size) {
        this.description = description;
        this.size = size;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
