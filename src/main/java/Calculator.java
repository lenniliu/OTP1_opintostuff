public class Calculator {
    public static void main(String[] args) {
        System.out.println(addMe(5, 5));
        System.out.println(subtractMe(5, 5));
        System.out.println(multiplyMe(5, 5));

    }
    public static int addMe(int a, int b) {
        return a + b;
    }
    public static int subtractMe(int a, int b) {
        return a - b;
    }
    public static int multiplyMe(int a, int b) {
        return a * b;
    }
}
