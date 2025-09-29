public class Throw {
    public static int bagi(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Pembagi tidak boleh nol!");
        }
        return a / b;
    }

    public static void main(String[] args) {
        System.out.println("Hasil: " + bagi(10, 2));
        System.out.println("Hasil: " + bagi(5, 0)); 
    }
}