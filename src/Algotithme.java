import java.util.ArrayList;
import java.util.Optional;

public class Algotithme {

    private EnsembleObjet objets;
    private Sac sac1;
    private Sac sac2;


    public Algotithme(EnsembleObjet objets, Sac sac1, Sac sac2) {
        this.objets = objets;
        this.sac1 = sac1;
        this.sac2 = sac2;
    }

    public int[][][] creatCube() {
        return new int[sac1.getTaille()][sac2.getTaille()][objets.getNbObjet()];
    }

    public int[][][] phase1(int[][][] cube) {
        for (int i = 0; i < sac1.getTaille(); i++) {
            for (int j = 0; j < sac2.getTaille(); j++) {
                Obj obj = objets.getTableau().get(objets.getNbObjet());
                if ((obj.getPoid() <= i) || (obj.getPoid() <= j)) {
                    cube[i][j][objets.getNbObjet()] = obj.getUtilite();

                } else {
                    cube[i][j][objets.getNbObjet()] = 0;
                }
            }
        }
        return cube;
    }

    public int[][][] phase2(int[][][] cube ){
        int placeLibre1 = sac1.getTaille();
        int placeLibre2 = sac2.getTaille();
        int valeurMax = 0 ;
        for (int k=objets.getNbObjet()-1; k>0  ; k--) {
            int tailleObjetK = objets.getTableau().get(k).getPoid();
            int utiliteObjetK = objets.getTableau().get(k).getUtilite();
            int tailleObjetK1 =objets.getTableau().get(k+1).getPoid();
            for (int i = 0; i < sac1.getTaille(); i++) {
                for (int j = 0; j < sac2.getTaille(); j++) {
                    if(tailleObjetK <= placeLibre1 && tailleObjetK <= placeLibre1){
                       valeurMax = max(utiliteObjetK + cube[i-tailleObjetK][j][k+1],utiliteObjetK + cube[i][j-tailleObjetK][k+1]);
            // max de l'utilité + valeur pour l'objet presedent dans sac 1
            // utilité + valeur pour l'objet presedent dans sac 2


                    }
                    else if(tailleObjetK >= placeLibre1 && tailleObjetK <= placeLibre2 ){
                        valeurMax = max(utiliteObjetK + cube[i][j-tailleObjetK][k+1], cube[i][j][k+1]);
                        valeurMax = max( valeurMax, cube[i][j][k+1] );
                    }
                    else if(tailleObjetK <= placeLibre1 && tailleObjetK >= placeLibre2 ){
                        valeurMax = max(utiliteObjetK + cube[i-tailleObjetK][j][k+1], cube[i][j][k+1]);

                    }
                    else {
                        valeurMax = cube[i][j][k+1];
                    }
                    cube[i][j][k]= valeurMax;
                }
            }
        }
        return cube;
    }

    private int max (int valeur1, int valeur2){
       if (valeur1>= valeur2){
           return valeur1;
       }
        return valeur2;
    }
}
