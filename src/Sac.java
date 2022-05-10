import java.util.ArrayList;

public class Sac {

    private int taille;
    private int espaceLibre;
    private int utilite;
    private ArrayList<Obj> listObjet;

    public Sac(int taille) {
        this.taille = taille;
        this.espaceLibre = taille;
        this.listObjet = new ArrayList<>();
        this.utilite=0;
    }
    public int getTaille() {
        return taille;
    }
    public void addObjet(Obj objet){
        if (espaceLibre> objet.getPoid()) {
            listObjet.add(objet);
            espaceLibre = espaceLibre - objet.getPoid();
            utilite = utilite + objet.getUtilite();
        }
    }

    public int getEspaceLibre() {
        return espaceLibre;
    }


}
