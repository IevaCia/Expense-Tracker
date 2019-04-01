package models;

public class Beneficiary {
    private String name;
    private Category category;

    public Beneficiary(String name, Category category){
        this.name = name;
        this.category = category;

    }

    public String getName() {
        return name;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
