public class Exception {
    public static void main(String[] args) {
        try {
            String teks = null;
            System.out.println(teks.length());
        } catch (NullPointerException e) {
            System.out.println("Terjadi error: data belum diinisialisasi!");
        }
        System.out.println("Program tetap berjalan setelah exception.");
    }
}