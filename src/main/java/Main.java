public class Main {
    public static void main(String[] args) {

//        ContaCorrente contaCorrente = new ContaCorrente();
//        contaCorrente.setAgencia(2245);
//        contaCorrente.setNumero(123456);
//        contaCorrente.setCliente(new Cliente("Donald Trump"));
//        contaCorrente.depositar(500);
//        contaCorrente.setChequeEspecial(200);
//        contaCorrente.extrato();
//
//        System.out.println("=========================================");
//
//        Conta poupanca = new ContaPoupanca();
//        poupanca.setCliente(new Cliente("Joe Biden"));
//        poupanca.setAgencia(2244);
//        poupanca.setNumero(56789);
//        poupanca.depositar(1000);
//        poupanca.sacar(500);
//        poupanca.extrato();

        Conta cc = new ContaCorrente();
        cc.setCliente(new Cliente("Maria"));
        cc.setNumero(9908);
        cc.extrato();

        System.out.println("=======================");

         Conta poupanca = new ContaPoupanca();
         poupanca.setNumero(12345);
         poupanca.setAgencia(2222);
         poupanca.setCliente(new Cliente("Joao"));
         poupanca.depositar(800);
         poupanca.transferir(cc, 300);
         poupanca.extrato();

        System.out.println("======================");
        cc.extrato();


    }
}
