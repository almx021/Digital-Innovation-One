import java.util.ArrayList;
import java.util.stream.Collectors;

public class Banco {
    private String nome;
    private ArrayList<Conta> contas;
    
    public Banco(String nome) {
        this.nome = nome;
        contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void adicionarConta(Conta c) {
        contas.add(c);
    }

    public void listarContasPorClientes() {
        System.out.println(" === Lista de clientes e suas contas ===");

        contas.stream().collect(Collectors.groupingBy(conta -> conta.cliente)).forEach((cliente, contasCliente) -> {
            System.out.println("Cliente: " + cliente);
            System.out.println("Contas:");
            contasCliente.forEach(b -> System.out.println("\t" + b));
        });
    }

}
