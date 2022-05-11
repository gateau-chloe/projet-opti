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

    public int getUtilite(){
        return utilite;
    }
    public boolean addObjet(Obj objet){
        boolean dansLeSac = false;
        if (espaceLibre> objet.getPoid()) {
            listObjet.add(objet);
            dansLeSac = true;
            espaceLibre = espaceLibre - objet.getPoid();
            utilite = utilite + objet.getUtilite();
        }
        return dansLeSac;
    }

    public int getEspaceLibre() {
        return espaceLibre;
    }


}
