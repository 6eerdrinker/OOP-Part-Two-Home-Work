package OOP_Homework_Human;

public class Human {
    String name;
    private String town;
    String jobTitle;
    private int age;

    Human(String name, int age, String town, String jobTitle) {
        this.name = name;
        this.age =  age;
        this.town = town;
        this.jobTitle = jobTitle;
        testHuman();
        setTown();

    }
    public String getTown() {
        return town;
    }

    public void setTown() {
        if (town != null && !town.isEmpty()) {
            this.town = town;
        } else {
            this.town = " - Информация не указана !!!";
        }
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age <= 0) {
            this.age = Math.abs(age);
        } else {
            this.age = age;
        }
    }
    void testHuman(){
        if (name == null|| name.isEmpty()) {
            this.name = " - Информация не указана!!!";
        } else {
            this.name = name;
        }

        if (jobTitle == null || jobTitle.isEmpty()) {
            this.jobTitle = " - Информация не указана!!!";
        } else {
            this.jobTitle = jobTitle;
        }
    }

}
