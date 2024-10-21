public class Transporte {
    private String fabricante;
    private String tipo;
    private int capacidade;

    public Transporte(String fabricante, String tipo, int capacidade) {
        this.fabricante = fabricante;
        this.tipo = tipo;
        this.capacidade = capacidade;
    }
    public void mostrarInformacoes() {
        System.out.println("Fabricante: " + fabricante);
        System.out.println("Tipo de Transporte: " + tipo);
        System.out.println("Capacidade: " + capacidade + " pessoas");
    }
}
