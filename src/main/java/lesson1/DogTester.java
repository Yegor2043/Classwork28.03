package lesson1;

public class DogTester {
    public static void main(String[] args) {
        Dog trezor = new Dog();

        trezor.setAge(5);
        trezor.setName("Trezor");
        trezor.setBreed("Bulldog");
        trezor.setColor("White");

        System.out.println("Tresor breed is: " + trezor.getBreed());

        Dog eleonora = new Dog("Bolonka", "Eleonora", 3, "White");
        System.out.println("Eleonora's age is: " + eleonora.getAge());
        eleonora.bark();
        trezor.bark();

        eleonora.setAge(20);
        System.out.println("Eleonora's age is: " + eleonora.getAge());
        System.out.println("Number of dogs: " + Dog.numberOfDogs);
        Dog.hello();
    }
}

class Dog {
    public Dog(String dogBreed, String dogName, int dogAge, String dogColor)
    {
        breed = dogBreed;
        name = dogName;
        age = dogAge;
        color = dogColor;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 30) {
            this.age = age;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String breed;
    private String name;
    private int age;
    private String color;

    public Dog() {

    }

    void bark()
    {
        System.out.println(name + " bark-bark!");
    }
    public static int numberOfDogs = 2;
    public static void hello() {
        System.out.println("Hello");
    }

}
