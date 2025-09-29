import java.util.HashMap;

public class HashMapMain {
    public static void main(String[] args) {
        HashMap<String, Integer> nilaiMahasiswa = new HashMap<>();

        nilaiMahasiswa.put("Zahran", 90);
        nilaiMahasiswa.put("Ravli", 85);
        nilaiMahasiswa.put("Eva", 88);
        nilaiMahasiswa.put("Bunga", 92);

        for (String nama : nilaiMahasiswa.keySet()) {
            System.out.println(nama + " : " + nilaiMahasiswa.get(nama));
        }
    }
}