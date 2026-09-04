public class MainTransferenciaBancaria {
    public static void main(String[] args) {
        TransferenciaBancaria t = new TransferenciaBancaria("TX01", 250.0, "2025-07-28", "1234-5", "9876-0");
        System.out.println(t.resumoTransferencia());
    }
}
