package Gabriella.A2;

public class Dog {

    private String name;
    private int age;
    private int weight;
    private String race;

    public Dog(String name, int age, int weight, String race) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.race = race;
    }

    public void doWoof() {
        System.out.println("Woof!");
    }

    private int getAge() {
        return age;
    }

    private void setAge(int newAge) {
        this.age = newAge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public String getRace() {
        return race;
    }

    public void setRace(String race) {
        this.race = race;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", race='" + race + '\'' +
                '}';
    }
}
