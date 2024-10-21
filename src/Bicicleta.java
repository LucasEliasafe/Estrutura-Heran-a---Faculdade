public class Bicicleta extends Transporte {
    private boolean temCestinha;

    public Bicicleta(String fabricante, String tipo, int capacidade, boolean temCestinha) {
        super(fabricante, tipo, capacidade);
        this.temCestinha = temCestinha;
    }


}
