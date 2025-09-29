public class AkunBank {

    private int saldo;

    public AkunBank(int saldo) {
        this.saldo = saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public int getSaldo() {
        return this.saldo;
    }

    public int menabung(int saldo) {
        if (saldo > 0) {
            this.saldo += saldo;
            return this.saldo;
        } else {
            return 0;
        }
    }

    public void tarikTunai(int saldo) {
        // if (this.saldo - saldo <= 0) {
        // System.out.println("Tidak boleh minus");
        // if (this.saldo - saldo <= 10) {
        // System.out.println("Saldo harus tersisa 10");
        // } else {
        // this.saldo -= saldo;
        // System.out.println("Tarik tunai berhasil");
        // }
        // }
        if (this.saldo - saldo < 10) {
            System.out.println("Tidak boleh minus atau saldo harus tersisa 10");
        } else {
            this.saldo -= saldo;
            System.out.println("Tarik tunai berhasil, saldo sekarang: " + this.saldo);
        }

    }
}