public class SistemaIGBE {
    public static void main(String[] args) {
        for(EstadoBrasileiro e: EstadoBrasileiro.values()){
            System.out.println(e + " = " + e.getNome() + " " + e.getSigla() + " " + e.getNomeMaiusculo());
        }
    }    
}