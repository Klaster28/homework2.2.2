import javax.management.InvalidAttributeValueException;

public class Flower {
    private String name;
    private String flowerColor;
    private String country;
    private double cost;
    private int lifeSpan;


    Flower(String name, String flowerColor, String country, double cost, int lifeSpan) {

        if (name == null || name.isEmpty() || name.isBlank()) {
            this.name = "Нет данных";
        } else {
            this.name = name;
        }
        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
        if (country == null || country.isEmpty() || country.isBlank()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
        if (cost < 0) {
            this.cost = 0;
        } else {
            this.cost = cost;
        }
        if (lifeSpan < 0) {
            this.lifeSpan = 0;
        } else {
            this.lifeSpan = lifeSpan;
        }


    }

    public String getName() {
        return name;
    }

    public String getFlowerColor() {
        return flowerColor;
    }

    public String getCountry() {
        return country;
    }

    public double getCost() {
        return cost;
    }

    public int getLifeSpan() {
        return lifeSpan;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setLifeSpan(int lifeSpan) {
        this.lifeSpan = lifeSpan;
    }
}




