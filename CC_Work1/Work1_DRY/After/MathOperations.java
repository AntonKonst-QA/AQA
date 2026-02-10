package Work1_DRY.After;

public class MathOperations {
    public int universalAdd(int [] nums) {
        int num = 0;

        for (int n : nums) {
            num += n;
        }
        return num;
    }
}
