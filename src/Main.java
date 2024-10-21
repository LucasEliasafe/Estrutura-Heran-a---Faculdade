public class Main {
    public static void main(String[] args) {
        Onibus onibus = new Onibus("Mercedes", "Ônibus Urbano", 50, 40);
        Bicicleta bicicleta = new Bicicleta("Caloi", "Bicicleta Elétrica", 1, true);

        System.out.println("Informações do Ônibus:");
        onibus.mostrarInformacoes();

        System.out.println("\nInformações da Bicicleta:");
        bicicleta.mostrarInformacoes();
    }
}