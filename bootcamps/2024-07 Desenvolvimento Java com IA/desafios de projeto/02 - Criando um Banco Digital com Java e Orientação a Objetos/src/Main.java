public class Main {
    public static void main(String[] args) {
        Banco b = new Banco("B1");
        
        Cliente pessoa1 = new Cliente("Pessoa 1");
        Cliente pessoa2 = new Cliente("Pessoa 2");

        ContaCorrente c = new ContaCorrente(pessoa1);
        ContaPoupanca p = new ContaPoupanca(pessoa2);
        ContaPoupanca p2 = new ContaPoupanca(pessoa1);

        
        b.adicionarConta(c);
        b.adicionarConta(p);
        b.adicionarConta(p2);

        c.depositar(100);
        c.transferir(50, p);

        c.imprimirExtato();
        p.imprimirExtato();

        b.listarContasPorClientes();
    }
}
