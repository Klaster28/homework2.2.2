public class Main {
    private static void printInfo(Flower flower) {
        System.out.println("Название цветка - " + flower.getName() + ". Цвет бутона - " + flower.getFlowerColor() + ". Страна происхожения - " + flower.getCountry() + ". Стоимость за штуку - " + flower.getCost() + ". Количество дней стояния - " + flower.getLifeSpan() + ". ");
    }
    public Main() {
    }

    public static void main(String[] args) {

    Flower roza = new Flower("Роза обыкновенная", " ", "Голландия", 55.59, -1);
    Flower hrizantema = new Flower("Хризантема", " ", " ", 15, 5);
    Flower pion = new Flower("Пион", " ", "Англия", 69.9, 1);
    Flower gipsofila = new Flower("Гипсофила", " ", "Турция", 19.5, 10);

    printInfo(roza);
    printInfo(hrizantema);
    printInfo(pion);
    printInfo(gipsofila);
    }

   // private static void printInfo(Flower flower) {
    //    System.out.println("Название цветка - " + flower.getName() + ". Цвет бутона - " + flower.getFlowerColor() + ". Страна происхожения - " + flower.getCountry() + ". Стоимость за штуку - " + flower.getCost() + ". Количество дней стояния - " + flower.getLifeSpan() + ". ");
    //}
}