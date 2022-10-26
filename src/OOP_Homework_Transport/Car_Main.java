package OOP_Homework_Transport;
import java.time.LocalDate;
public class Car_Main {
    public static void main(String[] args) {
        Car lada = new Car(null, "Granta",
                2015,
                1.7f,"Желтый", "Россия",
                "Механическая",
                "Седан",
                "В666РА777", 5,
                true, new Car.Key(true,true),
                new Car.Insurance(LocalDate.now(), 6_500,"999999999"));
        lada.getInsurance().checkNumber();
        lada.getInsurance().checkValidUntil();

        Car audi = new Car(null, "A8 50 L TDI quattro",
                2020,
                3.0f,
                null, "Германия",
                "Автоматическая",
                "Седан", "А888АА028",
                5, false, new Car.Key(true,false),
                new Car.Insurance(LocalDate.now(),16_000,"123456789"));

        Car bmw = new Car("BMW", null, 2021,
                3.0f, "Черный", "Германия",
                "Автоматическая",
                "Кроссовер", "О000ОО001",
                7, true, new Car.Key(true, true),
                new Car.Insurance(LocalDate.now(),25_000, "222"));

        Car kia = new Car("KIA", "Sportage 4-го поколения", 0,
                2.4f, "Красный", "Южная Корея",
                "Вариатор",
                "Кроссовер", "М367ВА125", 5,
                true, new Car.Key(true,true),
                new Car.Insurance(LocalDate.now(),10_000,"987654321"));

        Car hyundai = new Car("Hyundai", "Avante", 2016,
                0.0f, "Оранжевый", "Южная Корея",
                "Вариатор",
                "Седан", "8888888", 0,
                false, new Car.Key(false,true),
                new Car.Insurance(LocalDate.now(),15_000,"098658431"));

        printInfo(lada);
        printInfo(audi);
        printInfo(bmw);
        printInfo(kia);
        printInfo(hyundai);

    }
    private static void printInfo(Car car) {
        System.out.println("Автомобиль: " + car.getBrand() + " " + car.getModel() +
                ", " + car.getProductionYear() + " года выпуска," +
                " объем двигателя: " + car.getEngineVolume() +
                " л., цвет: " + car.getColor() + ". Страна сборки: "
                + car.getAssemblyCountry() +
                ", трансмиссия: " + car.getTransmission() +
                ", тип кузова: " + car.getBodyType() +
                ", количество мест в салоне: " + car.getSeatsNum() +
                ". Государственный регистрационный номер: "
                + car.getRegNumber() + (car.isRegNumberValid() ? " - Корректный" : " - Некорректный")
                + " номер" + ". " + (car.isWinterTires() ? "Зимняя резина. " : "Летняя резина.") +
                " " + (car.getKey().isKeylessAccess() ? "Безключевой доступ." : "Безключевой доступ отсутствует.") +
                " " + (car.getKey().isRemoteEngineStart() ? "Дистанционный запуск." : "Без дстанционного запуска.") +
                " Номер страховки: " + car.getInsurance().getNumber() +
                " Стоимость страховки: " + car.getInsurance().getCost() +
                " Срок действия страховки: " + car.getInsurance().getValidUntil()
        );
    }
}
