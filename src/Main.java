public class Main {

        public static void main(String[] args) {

        Flower roza = new Flower("Роза обыкновенная", " ", "Голландия", 55.59, 1);
        Flower hrizantema = new Flower("Хризантема", " ", " ", 15, 5);
        Flower pion = new Flower("Пион", " ", "Англия", 69.9, 1);
        Flower gipsofila = new Flower("Гипсофила", " ", "Турция", 19.5, 10);

        printInfo(roza);
        printInfo(hrizantema);
        printInfo(pion);
        printInfo(gipsofila);
            System.out.println();
        printCostBouquet(roza,hrizantema,pion,gipsofila,roza,pion);
    }

   private static void printInfo(Flower flower) {
      System.out.println("Название цветка - " + flower.getName() + ". Цвет бутона - " + flower.getFlowerColor() + ". Страна происхожения - " + flower.getCountry() + ". Стоимость за штуку - " + flower.getCost() + ". Количество дней стояния - " + flower.getLifeSpan() + ". ");
    }

    private static void printCostBouquet(Flower... flowers) {
            double totalCost = 0;
            int minimumLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.getLifeSpan() < minimumLifeSpan) {
                minimumLifeSpan = flower.getLifeSpan();
            }

            totalCost += flower.getCost();
            printInfo(flower);
            System.out.println();
        }
        totalCost = totalCost * 1.1;
        System.out.println("Букет стоит - " + totalCost + " рублей.");
        System.out.println("Букет будет стоять - " + minimumLifeSpan + " дн.");

    }


}