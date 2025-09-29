public class AkunBankTest {
    public static void main(String[] args) {
        AkunBank akunBank1 = new AkunBank(0);
        // AkunBank akunBank2 = new AkunBank(0);
        // AkunBank akunBank3 = new AkunBank(0);

        // akunBank1.saldo = 20;
        // saldo akunBank2 = 40;
        // saldo akunBank2 = 80;
        akunBank1.setSaldo(20);
        System.out.println("Saldo akunBank1: " + akunBank1.getSaldo());
        // akunBank2.setSaldo(40);
        // System.out.println("Saldo akunBank2: " + akunBank2.getSaldo());
        // akunBank3.setSaldo(80);
        // System.out.println("Saldo akunBank3: " + akunBank3.getSaldo());

        System.out.println("Menabung 50 ke akunBank1: " + akunBank1.menabung(50));

        akunBank1.tarikTunai(60);
    }

    // Menabung

    // Tarik tunai, tidak boleh sampai minus(-) dan hanya boleh tersisa saldo 10

}
