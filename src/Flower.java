public class Flower {
    private String name;
    private String flowerColor;
    private String country;
    private double cost;
     int lifeSpan;



    Flower(String name, String flowerColor, String country, double cost, int lifeSpan){

    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name == null || name.isEmpty() || name.isBlank())
            this.name = "Нет данных";
        }else {
        this.name = name;
    }


    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        if (flowerColor == null || flowerColor.isEmpty() || flowerColor.isBlank()) {
            this.flowerColor = "белый";
        } else {
            this.flowerColor = flowerColor;
        }

        public String getCountry () {
            return country;
        }

        public void setCountry (String country){
            if (country == null || country.isEmpty() || country.isBlank()) {
                this.country = "Россия";
            } else {
                this.country = country;
            }

        }

        public double getCost () {
            return cost;
        }

        public void setCost ( double cost){
            if (cost < 0) {
                this.cost = 0;
            } else {
                this.cost = cost;
            }


        }
    }
}

