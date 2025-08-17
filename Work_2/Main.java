package Homework.Work_2;

public class Main {
    public static void main(String[] args) {

        //Car
        Car car = new Car("BMW", 1960);
        car.print();
        car.setYear(2025);
        car.print();

        //Rectangle
        Rectangle rectangle = new Rectangle(2.1, 2.4);
        rectangle.print();
        rectangle.setWidth(1);
        rectangle.calculateArea();
        rectangle.print();

        //Book
        Book book = new Book ("Мозг", "Кинг");
        book.printInfo();
        book.setAuthor("Пушкин");
        book.printInfo();

        //BankAccount
        BankAccount bankAccount = new BankAccount("Baby", 1000);
        bankAccount.print();
        bankAccount.deposit(500);
        bankAccount.withdraw(800);
        bankAccount.print();

        //Point
        Point point = new Point(12.4, 65.5);
        point.print();
        point.setX(71.0);
        point.print();

        //StudentGroup
        StudentGroup studentGroup = new StudentGroup("Колобки", 100);
        studentGroup.printInfo();
        studentGroup.setStudentCount(60);
        studentGroup.printInfo();

        //Circle
        Circle circle = new Circle(10);
        circle.print();
        circle.setRadius(20);
        circle.print();

        //Teacher
        Teacher teacher = new Teacher("Тамара Владимировна", "Математика");
        teacher.printInfo();
        teacher.setSubject("Английский язык");
        teacher.printInfo();

        //Product
        Product product = new Product("Картошка", 99);
        product.printInfo();
        product.setPrice(200);
        product.applyDiscount(50);
        product.printInfo();

        //Laptop
        Laptop laptop= new Laptop("Sony", 2000);
        laptop.printInfo();
        laptop.setPrice(1800);
        laptop.printInfo();


    }
}
