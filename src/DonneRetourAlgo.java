public class DonneRetourAlgo {
    private int nbObjet;
    private int algoOpti;
    private int algoBorne;
    private int algoPerso;
    private float rapportOptiPerso;
    private float rapportBornePerso;

    public DonneRetourAlgo(int nbObjet, int algoOpti, int algoBorne, int algoPerso){
        this.algoBorne =algoBorne;
        this.algoOpti = algoOpti;
        this.nbObjet = nbObjet;
        this.algoPerso = algoPerso;
        this.rapportBornePerso = (float)algoBorne/(float)algoPerso;
        this.rapportOptiPerso = (float)algoOpti/(float)algoPerso;
        System.out.print("rappot opti/perso");
        System.out.println(rapportOptiPerso);
    }

    public int getAlgoBorne() {
        return algoBorne;
    }

    public int getAlgoOpti() {
        return algoOpti;
    }

    public int getAlgoPerso() {
        return algoPerso;
    }

    public int getNbObjet() {
        return nbObjet;
    }

    public float getRapportBornePerso() {
        return rapportBornePerso;
    }

    public float getRapportOptiPerso() {
        return rapportOptiPerso;
    }

    @Override
    public String toString() {
        return "DonneRetourAlgo{" +
                "nbObjet=" + nbObjet +
                ", algoOpti=" + algoOpti +
                ", algoBorne=" + algoBorne +
                ", algoPerso=" + algoPerso +
                '}';
    }
}
