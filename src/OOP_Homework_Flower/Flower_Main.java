package OOP_Homework_Flower;

public class Flower_Main {
    public static void main(String[] args) {
        Flower rose = new Flower("Роза обыкновенная",null, "Голландия", 35.59);
        Flower chrysantemum = new Flower("Хризантема",null, null, 15.00);
        chrysantemum.lifeSpan = 5;
        Flower peony = new Flower("Пион",null, "Англия", 69.90);
        peony.lifeSpan = 1;
        Flower gypsophila = new Flower("Гипсофила", null, "Турция", 19.50);
        gypsophila.lifeSpan = 10;

        printInfo(rose);
        printInfo(chrysantemum);
        printInfo(peony);
        printInfo(gypsophila);
        System.out.println();
        System.out.println("Букет Праздничный");
        printCostOfBouquet(rose, rose, rose, chrysantemum, chrysantemum, chrysantemum, chrysantemum,
                chrysantemum, gypsophila);
    }
    private static void printInfo(Flower flower) {
        System.out.println(flower.getFlowerName() + ", цвет: "+ flower.getFlowerColor() +
                ", страна происхождения: " + flower.getCountry() + ", стоимость за штуку: " +
                flower.getCost() + " руб, срок свежести: " + flower.lifeSpan);
    }
    private static void printCostOfBouquet(Flower... flowers) {
        double totalCost = 0;
        int minimumLifeSpan = Integer.MAX_VALUE;
        for (Flower flower : flowers) {
            if (flower.lifeSpan < minimumLifeSpan) {
                minimumLifeSpan = flower.lifeSpan;}
            totalCost += flower.getCost();
            printInfo(flower);}

        totalCost = totalCost * 1.1;
        System.out.println("Общая стоимость букета: " + totalCost);
        System.out.println("Срок свежести букета - " + minimumLifeSpan);
    }
    }

