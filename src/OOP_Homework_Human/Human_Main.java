package OOP_Homework_Human;

public class Human_Main {
    public static void main(String[] args) {
        int currentYear = 2022;

        Human maxim = new Human("", 35, "", "бренд - менеджера");
        Human anya = new Human("Аня", 0, "Москва", "методиста образовательных программ");
        Human katya = new Human("Катя", 28, "Калининград", null);
        Human artyom = new Human("Артем", 27,  "", "директора по развитию бизнеса");
        Human vladimir = new Human("Владимир", 21, "Казань", "");
        System.out.println("Привет! Меня зовут " + maxim.name + ". Я из города " + maxim.getTown() + ". Год рождения  "
                + (currentYear - maxim.getAge()) + ". Я работаю на должности " + maxim.jobTitle + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + anya.name + ". Я из города " + anya.getTown() + ". Год рождения  "
                + (currentYear - anya.getAge()) + ". Я работаю на должности " + anya.jobTitle + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + katya.name + ". Я из города " + katya.getTown() + ". Год рождения  "
                + (currentYear - katya.getAge()) + ". Я работаю на должности " + katya.jobTitle + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + artyom.name + ". Я из города " + artyom.getTown() + ". Год рождения  "
                + (currentYear - artyom.getAge()) + ". Я работаю на должности " + artyom.jobTitle + ". Будем знакомы!");
        System.out.println("Привет! Меня зовут " + vladimir.name + ". Я из города " + vladimir.getTown() + ". Год рождения  "
                + (currentYear - vladimir.getAge()) + ". Я работаю на должности " + vladimir.jobTitle + ". Будем знакомы!");
    }
}
