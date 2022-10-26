package OOP_Homework_Transport;

import java.time.LocalDate;

public class Car {
    private final String brand;
    private final String model;
    private final int productionYear;
    public float engineVolume;
    public String color;
    private final String assemblyCountry;
    public String transmission;
    private final String bodyType;
    public String regNumber;
    private final int seatsNum;
    public boolean winterTires;

    private final Key key;
    private final Insurance insurance;

    public Car(String brand, String model,
               int productionYear, float engineVolume,
               String color, String assemblyCountry,
               String transmission, String bodyType,
               String regNumber, int seatsNum,
               boolean winterTires,
               Key key,
               Insurance insurance) {
        if (brand == null || brand.isBlank()) {
            this.brand = "Default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isBlank()) {
            this.model = "Default";
        } else {
            this.model = model;
        }
        if (productionYear == 0) {
            this.productionYear = 2000;
        } else {
            this.productionYear = productionYear;
        }
        if (assemblyCountry == null || assemblyCountry.isBlank()) {
            this.assemblyCountry = "Default";
        } else {
            this.assemblyCountry = assemblyCountry;
        }
        if (bodyType == null || bodyType.isBlank()) {
            this.bodyType = "Default";
        } else {
            this.bodyType = bodyType;
        }

        this.regNumber = regNumber;
        this.seatsNum = Math.max(seatsNum, 1);
        this.winterTires = winterTires;

        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
        setEngineVolume(engineVolume);
        setColor(color);
        setTransmission(transmission);
        setRegNumber(regNumber);
        setWinterTires(isWinterTires());


    }

    public void setSeasonTires() {
        int currentMonth = LocalDate.now().getMonthValue();
        if (currentMonth <= 4 || currentMonth >= 11 != this.winterTires) {
            System.out.println("Нужные обутки уже установлены");
        } else {
            System.out.println("Пора переобуться");
        }
    }

    public boolean isRegNumberValid() {
        if (regNumber.length() != 9) {
            return false;
        }
        char[] regNumberChars = this.regNumber.toCharArray();
        return isNumberLetter(regNumberChars[0])
                && isNumber(regNumberChars[1])
                && isNumber(regNumberChars[2]) && isNumber(regNumberChars[3])
                && isNumberLetter(regNumberChars[4]) && isNumberLetter(regNumberChars[5])
                && isNumber(regNumberChars[6]) && isNumber(regNumberChars[7]) && isNumber(regNumberChars[8]);
    }

    private boolean isNumber(char simbol) {
        return Character.isDigit(simbol);
    }

    private boolean isNumberLetter(char simbol) {
        String allowedSimbols = "АБВГДЕЖЗИКЛМНОПРСТУФХЦЧШЩЭЮЯ";
        return allowedSimbols.contains("" + simbol);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public float getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(float engineVolume) {
        this.engineVolume = engineVolume > 0.0f ? engineVolume : 1.5f;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = ValidationUtil.validOrDefault(color, "Белый");
    }

    public String getAssemblyCountry() {
        return assemblyCountry;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = ValidationUtil.validOrDefault(transmission, "МКПП");
    }

    public String getBodyType() {
        return bodyType;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = ValidationUtil.validOrDefault(regNumber, "Не корректный номер");
    }

    public int getSeatsNum() {
        return seatsNum;
    }

    public boolean isWinterTires() {
        return winterTires;
    }

    public void setWinterTires(boolean winterTires) {
        this.winterTires = isWinterTires();
    }

    public Key getKey() {
        return key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public static class Key {
        private final boolean remoteEngineStart;
        private final boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

        public Key() {
            this(false, false);
        }


        public boolean isRemoteEngineStart() {
            return remoteEngineStart;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }

    public static class Insurance {
        private final LocalDate validUntil;
        private final float cost;
        private final String number;


        public Insurance(LocalDate validUntil, float cost, String number) {
            if (validUntil == null) {
                this.validUntil = LocalDate.now().plusDays(365);
            } else {
                this.validUntil = validUntil;
            }

            this.cost = cost;
            if (number == null) {
                this.number = "123456789";
            } else {
                this.number = number;
            }
        }


        public Insurance() {
            this(null, 10_000, null);
        }

        public LocalDate getValidUntil() {
            return validUntil;
        }

        public float getCost() {
            return cost;
        }

        public String getNumber() {
            return number;
        }

        public void checkValidUntil() {
            if (validUntil.isBefore(LocalDate.now()) || validUntil.equals(LocalDate.now())) {
                System.out.println("Срочно оформлять новую страховку");
            }
        }

        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки не корректный");
            }
        }
    }
}

