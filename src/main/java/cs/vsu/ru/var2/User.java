package cs.vsu.ru.var2;

public class User {
    private String name;
    private String secondName;
    private Integer age;
    private Gender gender;
    private Double capital;

    public User(String name, String secondName, Integer age, Gender gender) {
        this(name, secondName, age, gender, 0.0);
    }

    public User(String name, String secondName, Integer age, Gender gender, Double capital) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.gender = gender;
        this.capital = capital;
    }

    public Double getCapital() {
        return capital;
    }

    public void setCapital(Double capital) {
        this.capital = capital;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", capital=" + capital +
                '}';
    }

    public enum Gender {
        MALE,
        FEMALE;
    }
}
