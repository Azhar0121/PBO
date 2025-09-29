public class Throws {
    public static int bagi(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Pembagi tidak boleh nol!");
        }
        return a / b;
    }

    public static void main(String[] args) {
        try {
            System.out.println("Hasil: " + bagi(20, 2));
            System.out.println("Hasil: " + bagi(5, 0)); 
        } catch (ArithmeticException exception) {
            System.out.println("Terjadi kesalahan: " + exception.getMessage());
        }
    }
}
