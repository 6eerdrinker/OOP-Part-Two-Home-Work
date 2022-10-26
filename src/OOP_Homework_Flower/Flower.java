package OOP_Homework_Flower;

public class Flower {
    private String flowerName;
    private String flowerColor;
    private String country;
    private double cost;
    int lifeSpan;

    public Flower(String flowerName, String flowerColor, String country, double cost, int lifeSpan) {
        if (flowerName == null) {
            this.flowerName = "Ромашка";
        }else {
            this.flowerName = flowerName;}
        if (flowerColor == null) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;}
        if (country == null) {
            this.country = "Россия";
        }else {
            this.country = country;}
        if (cost <= 0) {
            this.cost = 1;
        }else {
            this.cost = cost;
        }
        if (lifeSpan <= 0) {
            this.lifeSpan = 3;
        }else {
            this.lifeSpan = lifeSpan;}}


    public Flower(String flowerName, String flowerColor, String country, double cost) {
        this(flowerName, flowerColor, country, cost, 3);
    }

    public String getFlowerName() {
        return flowerName;
    }
    public void setFlowerName() {
        if (flowerName == null) {
            this.flowerName = "Ромашка";
        }else {
            this.flowerName = flowerName;}
    }
    public String getFlowerColor() {
        return flowerColor;
    }
    public void setFlowerColor() {
        if (flowerColor == null) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }
    }
    public String getCountry() {
        return country;
    }
    public void setCountry() {
        if (country == null || country.isEmpty()||country.isBlank()) {
            this.country = "Россия";
        } else {
            this.country = country;
        }
    }
    public double getCost() {
        return cost;
    }
    public void setCost() {
        if (cost <= 0) {
            this.cost = 1;
        }else {
            this.cost = cost;}
    }
}
