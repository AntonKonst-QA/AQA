package Work1_DRY.After;

public class Main {
    public static void main(String[] args) {
        MathOperations mathOperations = new MathOperations();

        int[] myNumbers = {1, 2, 3, 4, 5};

        int result = mathOperations.universalAdd(myNumbers);

        System.out.println("Сумма чисел равна: " + result);
    }
}
