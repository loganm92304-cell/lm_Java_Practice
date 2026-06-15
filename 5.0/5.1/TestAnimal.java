public class TestAnimal {
    public static void main(String[] args) {

        Animal a = new Animal("Generic");
        Dog d = new Dog("Buddy");
        Cat c = new Cat("Kitty");

        System.out.println(a);
        a.makeSound();

        System.out.println(d);
        d.makeSound();

        System.out.println(c);
        c.makeSound();
    }
}