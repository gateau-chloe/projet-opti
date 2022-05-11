public class algoBorne {
    private EnsembleObjet listeObjet;
    private Sac sac1;
    private Sac sac2;


    public void born() {
        // a remplacer par le retour de la fonction de trie dans Ensemble objet
        EnsembleObjet trie = new EnsembleObjet(4);
        // a remplacer par le fonction qui addition les 2 sacs
        Sac sac = new Sac(4);

        int espaceLibre = sac.getTaille();
        int iemeObjet = 0;
        int utilite = 0;
        while (espaceLibre != 0 && iemeObjet != trie.getNbObjet()) {
            Obj obj = trie.getTableau().get(iemeObjet);
            if (obj.getPoid() < espaceLibre) {
                sac.addObjet(obj);
                espaceLibre = espaceLibre - obj.getPoid();
                utilite = utilite + obj.getUtilite();
            }
            iemeObjet++;
        }
    }

    public Sac fusionSac(){
        return new Sac(sac1.getTaille()+ sac2.getTaille());
    }
    public void born2() {
        // a remplacer par le retour de la fonction de trie dans Ensemble objet
        listeObjet.triUtilite();
        EnsembleObjet trie = listeObjet;
        // a remplacer par le fonction qui addition les 2 sacs
        Sac sac = new Sac(4);

        int iemeObjet = 0;
        while (sac.getEspaceLibre() != 0 && iemeObjet != trie.getNbObjet()) {
            Obj obj = trie.getTableau().get(iemeObjet);
            sac.addObjet(obj);
            iemeObjet++;
        }

    }
}