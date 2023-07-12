public class Planta {
    private int tamMaxPlanta;
    private String tipoPlanta;
    private int tamanho = 0;
    private int galhos;

    public Planta(String tipoPlanta, int tamMaxPlanta) {
        this.tipoPlanta = tipoPlanta;
        this.tamMaxPlanta = tamMaxPlanta;
    }

    public void adubarPlanta() {
        if (tamanho + 1 <= tamMaxPlanta) {
            tamanho = tamanho + 1;
            galhos = galhos + 1;
            System.out.println("Sua " + tipoPlanta + " cresceu 1cm, tamanho atual: " + tamanho + "cm.");
        } else {
            System.out.println("Sua " + tipoPlanta + " chegou em seu tamanho de crescimento máximo.");
        }
    }

    public void podarGalhos(int quantidadeGalhos) {
        if (quantidadeGalhos <= galhos) {
            galhos = galhos - quantidadeGalhos;
            System.out.println("Foram podados " + quantidadeGalhos + " galhos. Número de galhos: " + galhos);
        } else {
            System.out.println("Sua " + tipoPlanta + " não tem todos esses galhos para podar!");
        }
    }
}
