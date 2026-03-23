package Work6_LSP.After;

public class Bird {
    public void eat() {
        System.out.println("Птица ест");
    }
}

interface Flyable {
    public void fly();
}

interface Swimmable{
    public void swim();
}

class Sparrow extends Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Воробей летает");
    }
}

class Penguin extends Bird implements Swimmable {
    @Override
    public void swim() {
        System.out.println("Пингвин плавает");
    }
}
