package Work6_LSP.After;

public class Bird {
    public void eat() {
        System.out.println("Птица ест");
    }
}

class FlyingBurd extends Bird {
    public void fly() {
        System.out.println("Птица летит");
    }
}

class NonFlyingBurd extends Bird {
    public void swim() {
        System.out.println("Птица плывет");
    }
}
class Sparrow extends FlyingBurd {

}

class Penguin extends NonFlyingBurd {

}
