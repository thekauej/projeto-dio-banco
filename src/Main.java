public class Main {
    public static void main(String[] args) {
        Cliente kaue = new Cliente();
        kaue.setNome("Kaue Jorge");

        Conta cc = new ContaCorrente(kaue);
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca(kaue);
        cc.transferir(100,poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
