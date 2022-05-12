public class AlgotithmeOptimal {

    private EnsembleObjet objets;
    private Sac sac1;
    private Sac sac2;


    public AlgotithmeOptimal(EnsembleObjet objets, Sac sac1, Sac sac2) {
        this.objets = objets;
        this.sac1 = sac1;
        this.sac2 = sac2;
    }

    private int[][][] creatCube() {
        return new int[sac1.getTaille()+1][sac2.getTaille()+1][objets.getNbObjet()];
    }

    private int[][][] phase1(int[][][] cube) {
        for (int i = 0; i <= sac1.getTaille(); i++) {
            for (int j = 0; j <= sac2.getTaille(); j++) {
                Obj obj = objets.getTableau().get(objets.getNbObjet()-1);
                if ((obj.getPoid() <= i) || (obj.getPoid() <= j)) {
                    cube[i][j][objets.getNbObjet()] = obj.getUtilite();

                } else {
                    cube[i][j][objets.getNbObjet()] = 0;
                }
            }
        }
        return cube;
    }

    private int[][][] phase2(int[][][] cube ) {
        for (int k=objets.getNbObjet()-2; k>=0  ; k--) {
            int tailleObjetK = objets.getTableau().get(k).getPoid();
            int utiliteObjetK = objets.getTableau().get(k).getUtilite();
            for (int i = 0; i <= sac1.getTaille(); i++) {
                for (int j = 0; j <= sac2.getTaille(); j++) {
                    int valeurMax=cube[i][j][k+1];
                    if (i>=objets.getTableau().get(k-1).getPoid()){
                        valeurMax = max(valeurMax,utiliteObjetK + cube[i-tailleObjetK][j][k+1] );
                    }
                    if (j>=objets.getTableau().get(k-1).getPoid()){
                        valeurMax = max(valeurMax,utiliteObjetK + cube[i][j-tailleObjetK][k+1] );
                    }
                    cube[i][j][k]= valeurMax;
                }
            }
        }
        return cube;
    }

    private int utiliteOptimal(int[][][] cube){
        int utilite= cube[0][0][0];
        return utilite;
    }

    public int run (){
        int[][][] cube = creatCube();
        phase1(cube);
        phase2(cube);
        return utiliteOptimal(cube);
    }
    private int max (int valeur1, int valeur2){
       if (valeur1>= valeur2){
           return valeur1;
       }
        return valeur2;
    }
}
