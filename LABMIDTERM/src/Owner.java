
public class Owner {
    protected final String name;
    protected Animal animal;
    public Owner() {
       this("", null); 
    }
    public Owner(String name) {
        this.name = name;
    }
    public Owner(Animal animal) {
        this.animal = animal;
        this.name = "";
    }
    public Owner(String name, Animal animal) {
        this.name = name;
        this.animal = animal;
    }
    public String getName() {
        return name;
    }
    public Animal getAnimal() {
        return animal;
    }
    public void setAnimal(Animal animal) {
        this.animal = animal;
    }
    public void feedFood(Food f) {
        this.animal.eat(f);
    }
    @Override
    public String toString() {
        return "Owner : name = " + name + ", Animal : name = " + animal.toString();
    }
    public void protectOwnerFrom(Animal a) {
        if (animal instanceof Dog) {
            Dog dog = (Dog)animal;
            dog.kick(a);
        } else if (animal instanceof Bird) {
            Bird bird = (Bird)animal;
            bird.wingAttack(a);
        }
    }
}
