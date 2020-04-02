package mastersTools.items;

public interface Item {
    String getName();
    void setName(String name);
    String getDescription();
    void setDescription(String description);
    int getPrice();
    void setPrice(int price);
    double getWeight();
    void setWeight(double weight);
}
