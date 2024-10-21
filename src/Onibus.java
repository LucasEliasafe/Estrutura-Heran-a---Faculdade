public class Onibus extends Transporte {
    private int numeroDeAssentos;

    public Onibus(String fabricante, String tipo, int capacidade, int numeroDeAssentos) {
        super(fabricante, tipo, capacidade);
        this.numeroDeAssentos = numeroDeAssentos;
    }


}