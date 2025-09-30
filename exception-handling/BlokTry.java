public class BlokTry {
    public static void main(String[] args) {
        int[] data = { 1, 2, 3, 4, 5 };
        try {
            System.out.println("Index ke-" + data[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index array di luar batas!");
        } finally {
            System.out.println("Program selesai dijalankan.");
        }
    }
}