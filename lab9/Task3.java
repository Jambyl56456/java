class MathUtils {
    static int square(int x) {
        return x * x;
    }

    static int cube(int x) {
        return x * x * x;
    }
}

public class Task3 {
    public static void main(String[] args) {
        System.out.println(MathUtils.square(3));
    }
}
