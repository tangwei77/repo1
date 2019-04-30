package Animal;

public class Person {
    private String name;
    private int age;
    private Animal animal;

    public void keepPet(Animal animal,String something){
        System.out.println("喂养"+animal.getColorl()+"吃"+something);
    }

    public Person() {
    }

    public Person(String name, int age, Animal animal) {
        this.name = name;
        this.age = age;
        this.animal = animal;
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
        this.age = age;
    }

    public Animal getAnimal() {
        return animal;
    }

    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
}
